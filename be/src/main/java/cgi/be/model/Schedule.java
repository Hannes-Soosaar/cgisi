package cgi.be.model;

public class Schedule {

    private Long id;
    private Integer date;
    private Integer time;
    private Integer movieScreeningId;


    public Schedule() {
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    public void setDate(Integer date) {
        this.date = date;
    }
    public Integer getDate() {
        return date;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public void setMovieScreeningId(Integer movieScreeningId) {
        this.movieScreeningId = movieScreeningId;
    }
    public Integer getMovieScreeningId() {
        return movieScreeningId;
    }

    public Integer getTime() {
        return time;
    }
    @Override
    public String toString() {
        return "Schedule{" +
                "id=" + id +
                ", date=" + date +
                ", time=" + time +
                ", movieScreeningId=" + movieScreeningId +
                '}';
    }
}
