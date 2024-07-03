const target = document.getElementById('target');
const btn_32 = document.getElementById('btn-32');
const btn_50 = document.getElementById('btn-50');
const btn_90 = document.getElementById('btn-90');

function changeSize(size) {

    function updateSize() {
        target.style.fontSize = `${size}px`;
        target.style.backgroundColor = 'lightgreen';
    }

    return updateSize;
}

const changeSizeTo_32 = changeSize(32);
btn_32.addEventListener('click', changeSizeTo_32);

const changeSizeTo_50 = changeSize(50);
btn_50.addEventListener('click', changeSizeTo_50);

const changeSizeTo_90 = changeSize(90);
btn_90.addEventListener('click', changeSizeTo_90);


// creating counter using clouser

function createCounter() {
    let count = 1;

    function Increment() {
        console.log(count++);
    }

    return Increment;
}

const myCounter = createCounter();

for (let i = 0; i < 10; i++) {
    myCounter();
}