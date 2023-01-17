import { Component } from '@angular/core';
import { Movie } from './movie';

@Component({
  selector: "app-root",
  templateUrl: `app.component.html`,
  styleUrls: [`app.component.scss`]
})
export class AppComponent {
 
  empName:string = "suPerMan";

  idObj:Date = new Date(1947, 7, 15);
  salary:number = 120000;

  movies:Movie[] = [
    {id: 34, title: "Batman", director: "Mike", rating: 4.8},
    {id: 12, title: "Hulk", director: "Bruce", rating: 4.7}
  ]

}
