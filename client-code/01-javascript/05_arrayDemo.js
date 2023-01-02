// var names = [];
var names = new Array();

names.push("Mike");
names.push("Miley");
names.push("Tom");
names.push("John");
names.push("Carl");
names.push("Kim");


console.log(names);

names.sort();

console.log(names);
// console.log(names.reverse());


// remove nth element from array
var fromIndex = 2;
var elementsCount = 1;
names.splice(fromIndex, elementsCount);

console.log(names);
