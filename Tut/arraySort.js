let array=[1,3,5,2,20];


array.forEach(myfuntion);

function myfuntion(value){
    process.stdout.write(value+" ");
}

let lowest=0;
for(let i=0;i<array.length-1;i++)
{
    if(array[i]<lowest)
    {
        lowest==array[i];
    }


console.log("\n"+lowest+" Is the lowest number in your array");}
