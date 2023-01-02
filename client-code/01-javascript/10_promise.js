// database connection
// var dbUser = "root";
// var dbPwd = "root";
var myDbConnectionPromise = function(dbUser, dbPwd){
    return new Promise(function(resolve, reject){

        var envUsername = "root";
        var envPassword = "root";
    
        if(envPassword === dbPwd && envUsername===dbUser){
            // make db connection
            resolve("connection established");
        } else {
            reject(new Error("Invalid credentials"))
        }
    });
};

myDbConnectionPromise("root", "root")
.then(function(data){
    console.log(data)
    return "person";
})
.then(function(tableName){
    console.log("create a table: "+tableName);
    return {name: "Jacky", age: 65}
})
.then(function(personObj){
    console.log("saving person: "+JSON.stringify(personObj));
})
.then(function(){
    console.log("closing db connection")
})
.catch(function(e){
    console.error("++++Error occurred: "+e.message+"+++++")
})
.finally(() => {
    console.log("This is finally() block that is executed after Promise is settled");
  });


