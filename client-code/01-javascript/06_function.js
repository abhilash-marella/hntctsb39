function div(a, b){
    return a/b;
}

div(4,2)

function add(){
    var sum = 0;
    for(var i=0;i<arguments.length;i++){
        if(!isNaN(arguments[i])){
            sum += +arguments[i];
        }
    }
    return sum;
}

add(3,4);
add(3, "5");

add(3, "5", "nine");

add(3, "5", "nine", {}, [], 8, null, skdhfsdkjfh);



var sum = function(){
    var sum = 0;
    for(var i=0;i<arguments.length;i++){
        if(!isNaN(arguments[i])){
            sum += +arguments[i];
        }
    }
    return sum;
}

sum(2,5)