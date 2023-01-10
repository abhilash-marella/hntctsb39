import { Component } from '@angular/core';
import { Movie } from './movie';

@Component({
  selector: "app-root",
  templateUrl: `app.component.html`,
  styleUrls: [`app.component.scss`]
})
export class AppComponent {

  movies:Movie[] = [];

  constructor(){
    setTimeout(()=>{
      this.movies.push(new Movie(137, "Batman", "Maulik", 4.7, new Date()));
      this.movies.push(new Movie(27, "Hulk", "Jaivik", 4.4));
      }, 5000)
  }

}
