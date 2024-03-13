package cgi.be.model;

public class MovieScreening {

    private Long id;
    private Integer movieId;
    private Integer screenId;
    private Integer ticketCostId;


    public MovieScreening() {
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setMovieID(Integer movieId) {
        this.movieId = movieId;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setScreenId(Integer screenId) {
        this.screenId = screenId;
    }

    public Integer getScreenId() {
        return screenId;
    }

    public void setTicketCostId(Integer ticketCostId) {
        this.ticketCostId = ticketCostId;
    }

    public Integer getTicketCostId() {
        return ticketCostId;
    }

    @Override
    public String toString() {
        return "Movie Screening { " + "id= " + id +
                ", screenId = " + screenId +
                ", movieId = " + movieId +
                ", ticketCostId = " + ticketCostId +
                " }";
    }

}
