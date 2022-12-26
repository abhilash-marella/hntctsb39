// arrow function
var myDbConnectionPromise = async (dbUser, dbPwd)=>{
    return await new Promise(function(resolve, reject){

        var envUsername = "root";
        var envPassword = "root";
    
        if(envPassword === dbPwd && envUsername===dbUser){
            // make db connection

            // takes 2 sec

            resolve("connection established");
        } else {
            reject(new Error("Invalid credentials"))
        }
    });
};

try{

    var result = await myDbConnectionPromise("root", "root")
    console.log(result);
    console.log("connect to printer");
} catch(e){
    console.log("handle errors here")
    console.log(e.message);
}






// javascript lexical environment

setTimeout(function(){
    console.log("in setTimeout")
}, 2000);
console.log("after setTimeout")