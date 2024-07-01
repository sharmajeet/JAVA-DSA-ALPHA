const button = document.getElementById('search-btn');
const input = document.getElementById('search-filed')

const city_name = document.getElementById("city-name");
const city_temp = document.getElementById("city-temp");
const city_whether = document.getElementById('city-wheather');

const curr_loc = document.getElementById('curr_loc');
const curr_data = document.getElementById('curr_data');

button.addEventListener('click', async () => {
    let cityName = input.value;
    console.log(cityName);
    const result = await getData(cityName);
    console.log(result)

    city_name.innerText = `${result.location.name} , ${result.location.region}`

    city_temp.innerText = `${result.current.temp_c} °C`

    city_whether.innerText = `${result.current.condition.text}`
});

async function getData(cityName) {
    let res = await fetch(`http://api.weatherapi.com/v1/current.json?key=6d6905d29fc245c59e9141027240107 &q=${cityName}&aqi=yes`);
    return await res.json();
}

// if current location fetched succesfully
async function isPass(lat, long) {
    curr_data.innerText = await `${lat} , ${long}`

}

function isFail() {
    console.log("There is an error while fetching your current position")
}
curr_loc.addEventListener('click', async () => {
    const data = await navigator.geolocation.getCurrentPosition((location) => { curr_data.innerText = ` Latitude : ${location.coords.latitude} , Longitude:  ${location.coords.longitude} ` }, () => { console.log("Error") });

})