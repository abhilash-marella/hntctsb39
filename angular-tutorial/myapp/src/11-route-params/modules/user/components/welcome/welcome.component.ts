import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.scss']
})
export class WelcomeComponent {

  currentUser:string = "";

  constructor(private activatedRoute:ActivatedRoute){
    this.activatedRoute.params.subscribe((parameters:any)=>{
      console.log(parameters);
      // this.currentUser = parameters.username;
      this.currentUser = parameters["username"];
    })
  }

}
