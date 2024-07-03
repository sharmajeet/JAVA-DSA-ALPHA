// function main() {
//     const name = "Jeet Sharma";

//     // This inner function is know as a clouser 
//     function sayName() {
//         console.log("My Name : ", name);
//     }

//     sayName();
// }
// main();

// 2nd example if Adder

function adder(A){

    function add(B){
        console.log(A + B);
    }

    return add;
}

const innerFun  = adder(5);
innerFun(3);
innerFun(4);
innerFun(5);