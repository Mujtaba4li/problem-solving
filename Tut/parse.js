let student=`{
    "student":"Mujtaba",
    "degree":"BS Software Engineer",
    "CGPA":"2.63"
}`

let newStd=JSON.parse(student);
console.log(JSON.stringify(newStd));