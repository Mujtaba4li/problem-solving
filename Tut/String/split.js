let str="Its,me Mujtaba / and whats your \  name ur {}sunao";
let first=str.split(" / ").join();
let second=first.split("{}").join();
let print=second.replace(/,/g," ");
let removeSpace=print.replace(/\s+/g," ");

console.log(removeSpace);
