const time = document.getElementById('time');

function showTime() {
    const currentTime = new Date();

    const clcok = time.innerText = `${currentTime.getHours()}:${currentTime.getMinutes()}:${currentTime.getSeconds()}`;
}

let interval = setInterval(showTime, 1000);


const StopBtn = document.getElementById('stop');

StopBtn.addEventListener('click', () => {
    clearInterval(interval);
})


// StopWatch code part/
