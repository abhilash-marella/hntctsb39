import { Component, OnInit } from '@angular/core';
import { Movie } from './movie';
import { MovieService } from './services/movie.service';

@Component({
  selector: "app-root",
  templateUrl: `app.component.html`,
  styleUrls: [`app.component.scss`]
})
export class AppComponent implements OnInit {

  private counter:number = 0;

  movies:Movie[] = [];

  constructor(private movieService:MovieService){}

  ngOnInit(): void {
      this.findAllMovies();
  }

  findAllMovies(){
    this.movieService.getAllMovies().subscribe({
      next: (res:any)=>{
        console.log(res)
        this.movies = res;
        // this.isError = false;
      },
      // error: (err)=>{
      //   console.log("Something bad happened")
      //   console.log(err)
      //   // this.router.navigate(["error"])
      //   // this.errorMessage = "message"
      //   // this.isError = true;
      // }
    })
  }

  saveMoive (){
    let m:Movie = new Movie(++this.counter, "Title_"+this.counter, "Director_"+this.counter, 4.5);

    this.movieService.saveMovie(m).subscribe({
      next: (res:any)=>{
        console.log(res);
        this.findAllMovies();
      }
      // error: (err)=>{
      //   console.log("Something bad happened while saving movie")
      //   console.log(err)
      // }
    })

  }

}
