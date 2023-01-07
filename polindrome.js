let num=313;
let temp=num;

let print=num.toString().split('').reverse().join().replace(/,/g,'');
console.log(print);

if(temp==print)
{
    console.log(num+" is polindrome");
}
else{
    console.log(num+" not is polindrome");
}
