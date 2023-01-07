fibonacci=(input)=>{
  let num1=0,num2=1,sum=0;
  process.stdout.write(num1+" "+num2);

  for(let i=0;i<=input;i++)
  {
    sum=num1+num2;
    num1=num2;
    num2=sum;
    if(sum>=input)
    {
      break;
    }
    process.stdout.write(" "+sum);
  }


}

fibonacci(10);