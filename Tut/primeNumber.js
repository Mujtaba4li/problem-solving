const prompt=require("prompt-sync")();

let num=prompt("Enter a number");
let isTrue=Boolean("true");
for(let i=2;i<=num;i++)
{
    if(num==1)
    {
        continue;
    }
    if(i%num==0)
    {
        isTrue==false;
    }
}
if(isTrue==true)
{
    console.log("Enter Number is  prime");
}
else{
    console.log("Entered Number is not prime");
}