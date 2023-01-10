import { Component } from '@angular/core';

@Component({
  selector: "app-root",
  templateUrl: `app.component.html`,
  styleUrls: [`app.component.scss`]
})
export class AppComponent{

  name:string = "Bharat";

  changeName(str:string){
    // console.log("Updated name is: "+str)
    if(str.length > 0){
      this.name = str;
    } else {
      this.name = "Bharat";
    }
  }
}
