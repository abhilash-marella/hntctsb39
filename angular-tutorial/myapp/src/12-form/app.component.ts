import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: "app-root",
  templateUrl: `app.component.html`,
  styleUrls: [`app.component.scss`]
})
export class AppComponent {


  myForm:FormGroup;

  constructor(){
    this.myForm = new FormGroup({
      username: new FormControl("", [
        Validators.required,
        Validators.pattern("^[a-zA-Z]+$")
      ]),
      password: new FormControl(""),
    });
  }

  getLogin(){
    console.log(this.myForm)
    console.log(this.myForm.value)
    console.log(this.myForm.valid)

    // this.router.navigte(["welcome", ...])
  }

}
