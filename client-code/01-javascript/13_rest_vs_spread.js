
// rest operator === varargs in java5
function myBio(firstName, lastName, ...otherInfo) { 
    return otherInfo;
}

myBio("arun", "kumar", 37, "New York", {})


// spread operator
let user1 = {
    name: "arun",
    age: 37,
    address: "Tokyo"
}
let user2 = {
    name: "jyoti",
    age: 27,
    address: "Germany"
}

function printDetails(arg){
    arg.age = 105;
    console.log("User: "+JSON.stringify(arg));
}

let user1copy = {...user1, address: "japan"}
printDetails(user1)

