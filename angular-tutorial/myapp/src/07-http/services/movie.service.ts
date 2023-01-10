import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Movie } from '../movie';

@Injectable({
  providedIn: 'root'
})
export class MovieService {

  // p11_springboot-web-crud-h2
  private host:string = "http://localhost:8080/moviesapp/v1/movies"

  constructor(private httpClient:HttpClient) { }

  getAllMovies(){
    console.log("finding movies from server")
    // logic to fetch movies from backend
    return this.httpClient.get(this.host);
  }

  saveMovie(movie:Movie){
    return this.httpClient.post(this.host, movie);
  }
}
