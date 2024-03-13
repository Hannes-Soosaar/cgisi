package cgi.be.model;

public class Genre {

    private Long id;
    private String genre;

    public Genre() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Genre { " + "id= " + id + ", genre = " + genre + " }";
    }
}
