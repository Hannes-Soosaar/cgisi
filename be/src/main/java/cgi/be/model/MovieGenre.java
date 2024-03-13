package cgi.be.model;

public class MovieGenre {

    private Long id;
    private Integer movieId;
    private Integer genreId;

    public MovieGenre(){
    }


    public  void setId (Long id){
        this.id = id;
    }
    public Long getId(){
        return id;
    }
    public  void setMovieID (Integer movieId){
        this.movieId = movieId;
    }
    public Integer getMovieId(){
        return movieId;
    }
    public  void setGenreId (Integer genreId){
        this.genreId = genreId;
    }
    public Integer getGenreId(){
        return genreId;
    }

    @Override
    public String toString() {
        return "Movie Genre { " + "id= " + id +
                ", genreId = " + genreId +
                ", movieId = " + movieId +
                " }";
    }


}
