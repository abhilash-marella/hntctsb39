var print = function(data){
    console.log("Printing: "+JSON.stringify(data));
}

var storeInDb = function(data){
    console.log("SavingInDb: "+JSON.stringify(data));
}



var readFile = function(filePath, cb){
    console.log("Reading a file: "+filePath);
    var str = "This is a demo code";
    cb(str);
}


var path = "d://documents/myfile.txt";
readFile(path, storeInDb);

readFile(path, print);

readFile(path, function(arg){
    console.log("File data is : "+arg)
});
