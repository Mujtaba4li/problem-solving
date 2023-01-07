// "async and await make promises easier to write"

// async makes a function return a Promise

// await makes a function wait for a Promise
let x=3;
async function myFunction() {
  if (x == 0) {
    return "ok";
  }else{
    return "erro";
  }
}

myFunction().then(
   (value) =>{
    myDisplayer(value);
  },
   (error) =>{
    myDisplayer(error);
  }
);

myDisplayer = (input) => {
  console.log(input);
};
