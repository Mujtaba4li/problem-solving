let arr=[10,2,9,18,0,2,4,10,29,3];
let sortedArray=arr.sort((a,b)=>{return a-b});

let min=sortedArray[0];
let count=1
for(let i=0;i<sortedArray.length;i++)
{
    if(sortedArray[i]>min)
    {
        min=sortedArray[i];
        // break;
        count++;
        if(count==4)
        {
            break;
        }
        
    }
}
console.log(min);