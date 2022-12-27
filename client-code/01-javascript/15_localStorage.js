let item = {title: "Acer Gaming Laptop", price: 75000}

console.log("Title: "+item.title);
console.log("Price: "+item.price);

console.log("Item: "+JSON.stringify(item));

//------------

// localStorage.setItem("item", item)

// write item (as string) in a localStorage
localStorage.setItem("item", JSON.stringify(item))



