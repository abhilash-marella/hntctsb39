import { Component } from '@angular/core';
import { CalculatorService } from './services/cal.service';

@Component({
  selector: "app-root",
  templateUrl: `app.component.html`,
  styleUrls: [`app.component.scss`]
  // providers: [CalculatorService]
})
export class AppComponent{

  result:number = 0;

  // @autowired
  // CalculatorService calService;
  constructor(private calService:CalculatorService){}


  calculateNums(operation:string, op1:number, op2:number){
    if(operation=="add"){
      this.result = this.calService.add(op1, op2);
    } else if(operation=="mul"){
      this.result = this.calService.mul(op1, op2);
    } else {
      this.result = 0;
    }
  }
}
