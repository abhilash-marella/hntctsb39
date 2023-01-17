export class Movie{
// instance variables
    constructor(
        public id: number, 
        public title:string, 
        public director:string, 
        public rating:number,
        public releasedDate?:Date
    ){
        // initialisation
    }
}