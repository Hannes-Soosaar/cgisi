package cgi.be.model;

public class Booking {

    private Long id;
    private Integer userId;
    private String selectedRow;
    private Integer selectedSeat;
    private Integer movieScreeningId;

    public Booking() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setSelectedRow(String selectedRow) {
        this.selectedRow = selectedRow;
    }

    public String getSelectedRow() {
        return selectedRow;
    }

    public void setSelectedSeat(Integer selectedSeat) {
        this.selectedSeat = selectedSeat;
    }

    public Integer getSelectedSeat() {
        return selectedSeat;
    }

    public void setMovieScreeningId(Integer movieScreeningId) {
        this.movieScreeningId = movieScreeningId;
    }

    public Integer getMovieScreeningId() {
        return movieScreeningId;
    }

    @Override
    public String toString() {
        return "Booking { " + "id= " + id + ", user id = " + userId + ", selectedRow = " + selectedRow + ", selectedSeat = " +
                selectedSeat + ",MovieScreening= " + movieScreeningId + " }";
    }

}
