abstract class Employee {
    // private empName:string;
    // private empSalary:number;

    // constructor(empName:string, empSalary:number){
    //     this.empName = empName;
    //     this.empSalary = empSalary;
    // }

    constructor(private empName:string, private empSalary:number){
    }

    set name(n:string){
        this.empName = n;
    }
    get name():string{
        return this.empName;
    }
    set salary(s:number){
        this.empSalary = s;
    }
    get salary():number{
        return this.empSalary;
    }
    abstract deploy():number;
}



class FsdEmpl extends Employee {
    deploy():number{
        return 55;
    }
}


let ramesh = new FsdEmpl("Ramesh", 5500000);
// ramesh.email = "ramesh@gmail.com";

ramesh.name = "Ramesh Kapoor";


