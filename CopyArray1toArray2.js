let arr1=[1,3,1,20,4];
let arr2=[arr1.length];

for(let i=0;i<arr1.length;i++)
{
    arr2[i]=arr1[i];
}

for(let i=0;i<arr2.length;i++)
{
    process.stdout.write(arr2[i]+" ");
}