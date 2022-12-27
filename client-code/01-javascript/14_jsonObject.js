let item = {title: "Acer Gaming Laptop", price: 75000}

console.log("Title: "+item.title);
console.log("Price: "+item.price);

console.log("Item: "+JSON.stringify(item));

//------------

// write item (as string) in a file
let data = JSON.stringify(item);

// read item (as string) from a file
let item2 = JSON.parse(data)

