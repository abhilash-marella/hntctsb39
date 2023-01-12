import { ErrorHandler } from "@angular/core";

export class MyErrorHandler implements ErrorHandler{
    
    handleError(err: any): void{
        console.log("this is in my error handler");
        console.log(err)

        // if(err instanceof ...){}
    }
}