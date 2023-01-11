import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent {

  constructor(private router:Router){}

  getLogin(name:string="Hanuman"){
    // read form, and send username and password to server using httpClient
    // res is back

    // move to error page or show error message
    // move to success page/welcome page

    name = name.length == 0 ? "Hanuman":name;
    // goto welcome page
    // this.router.navigate(["welcome", name])
    this.router.navigate(["/", "user", "welcome", name])
  }
}
