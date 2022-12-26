var print = function(data, cb){
    console.log("Printing: "+JSON.stringify(data));
    var arg = 44;
    if(!!cb && typeof cb === 'function'){
        cb(arg);
    }}

var storeInDb = function(data, cb){
    console.log("SavingInDb: "+JSON.stringify(data));
    var arg = 44;
    if(!!cb && typeof cb === 'function'){
        cb(arg, function(){"Doing last activity"});
    }
}

var readFile = function(filePath, cb){
    console.log("Reading a file: "+filePath);
    var str = "This is a demo code";
    if(!!cb && typeof cb === 'function'){
        cb(str, print);
    }
}


var path = "d://documents/myfile.txt";


/*

readFile(path, storeInDb);
Reading a file: d://documents/myfile.txt
SavingInDb: "This is a demo code"
Printing: 44

*/