let n = 11;
let isPrime = true;
for (let i = 2; i <= n / 2; i++) {
if(n%i==0)
{
    isPrime=false
}


}
if(isPrime==true)
{
    console.log(n+" is prime");
}
else{
    console.log(n+" not is prime");
}