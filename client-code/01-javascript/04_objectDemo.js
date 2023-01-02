// es5
// function Item(name, price){
    
// }

//es6 - es2015
class Item{

    constructor(name, price){
        // at runtime we can declare instance var
        this.name = name;
        this.price = price;
    }

}

var mobile = new Item("iPhone Mobile", 124000);
console.log(mobile);

// magic
mobile.manufactureDate = new Date(2015, 00, 31)
mobile.orderId = 124
delete mobile.price 




var person = {
    "name": "Mike",
    "age": 24,
    "address": "Japan" 
};

var person = { };
// var person = new Object();

person.name="Mike";
person.age= 24;
person["address"] = "Japan" 