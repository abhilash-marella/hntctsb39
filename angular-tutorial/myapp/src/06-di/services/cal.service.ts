import { Injectable } from "@angular/core";

// @Service in springboot
@Injectable()
export class CalculatorService{
    add(n1:number, n2:number):number{
        return n1+n2;
    }

    mul(n1:number, n2:number):number{
        return n1*n2;
    }
}