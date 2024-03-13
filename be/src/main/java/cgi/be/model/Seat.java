package cgi.be.model;

public class Seat {
    private Long id;
    private Integer ScreenId;
    private String row;
    private Integer seat;
    private boolean available;

    public Seat(){

    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }

    public void setScreenId(Integer screenId) {
        ScreenId = screenId;
    }

    public Integer getScreenId() {
        return ScreenId;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public String getRow() {
        return row;
    }

    public void setSeat(Integer seat) {
        this.seat = seat;
    }
    public Integer getSeat() {
        return seat;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean getAvailable(){
        return available;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "id=" + id +
                ", ScreenId=" + ScreenId +
                ", row='" + row + '\'' +
                ", seat=" + seat +
                ", available=" + available +
                '}';
    }
}
