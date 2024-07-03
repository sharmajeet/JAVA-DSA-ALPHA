console.log("Jai Shree Ram");

// Synchronious Task
let a = 20;
let b=  40;
let result = a+b;
console.log(result);

// // Asynchronious Task
// async function getData(){
//     let data = await fetch('https://restful-booker.herokuapp.com/booking');
//     console.log(data);
// }

// getData();

// 2nd way to use it
fetch('https://restful-booker.herokuapp.com/booking')
.then(()=>{console.log("Data Fetched Succesfully")})
.catch((error)=>{console.log("Error" , error)})