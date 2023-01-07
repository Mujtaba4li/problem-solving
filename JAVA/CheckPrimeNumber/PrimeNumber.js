// npm init
// npm install prompt-sync

const prompt = require("prompt-sync")();

var num=prompt("Enter number:");
// var name = prompt("What is your name?");
var isPrime=true;


for(let i=2;i<num;i++)
{
    if(num%i==0)
    {
        isPrime=false;
    }
}
if(isPrime==true)
{
    console.log(`${num} is Prime Number`);
}else
{
    console.log(`${num} is not Prime Number`);
}
