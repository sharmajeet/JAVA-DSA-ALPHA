const my_name = document.getElementById('myname');
const button = document.getElementById("button");
const username = document.getElementById("username");
const details = document.getElementById("details");

function setData() {

}

button.addEventListener('click', () => {
    const value = my_name.value;
    console.log(value)
    localStorage.setItem('name', value)
    location.reload();
})

function getData() {

    const data = localStorage.getItem('name');
    console.log("Item get from localstorage is : " , data);

    if (data == null) {
        details.innerText = "Hi User, Welcome to our website."
    } else {

        username.innerText = data;
    }

}
getData();