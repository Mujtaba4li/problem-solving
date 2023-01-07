let num=123;
let print=num.toString().split("").reverse().join().replace(/,/g,'');
console.log(print);