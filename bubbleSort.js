function bubbleSort(array) {
    for (let i = array.length; i > 0; i--) {
        for (let j = 0; j < i - 1; j++) {
            if (array[j] > array[j + 1]) {
                [array[j], array[j + 1]] = [array[j + 1], array[j]];
            }
        }


    }
    return array;
}
// let arr=[5,3,2,5,2,6,8,6,1,3];   
const res = bubbleSort([5, 3, 2, 5, 2, 6, 8, 6, 1, 3]);
console.log(res);


