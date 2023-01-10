import { Component } from '@angular/core';

@Component({
  selector: "app-root",
  templateUrl: `app.component.html`,
  styleUrls: [`app.component.scss`]
})
export class AppComponent {

  myCssClass: string = "none";
  myStyleObj: any = {
    backgroundColor: 'blue',
    color: 'white'
  }

  flag: boolean = false;

  toggle() {
    this.flag = !this.flag;

    this.updateCssClass();
    this.updateStyle();
  }

  updateCssClass() {
    if (this.flag) {
      this.myCssClass = "happy";
    } else {
      this.myCssClass = "sad";
    }
  }

  updateStyle() {
    if (this.flag) {
      this.myStyleObj = {
        backgroundColor: 'blue',
        color: 'white'
      };
    } else {
      this.myStyleObj = {
        backgroundColor: 'white',
        color: 'blue'
      };
      this.myStyleObj.border="2px solid blue";
    }
  }

}
