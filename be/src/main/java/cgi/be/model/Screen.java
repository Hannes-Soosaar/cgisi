package cgi.be.model;

public class Screen {

    private Long id;
    private Integer totalSeats;
    private Integer availableSeats;
    private boolean available;

    public Screen() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setTotalSeats(Integer totalSeats) {
        this.totalSeats = totalSeats;
    }

    public Integer getTotalSeats() {
        return totalSeats;
    }

    public void setAvailableSeats(Integer availableSeats) {
        this.availableSeats = availableSeats;
    }

    public Integer getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    public boolean getAvailable(){
        return available;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "id=" + id +
                ", totalSeats=" + totalSeats +
                ", availableSeats=" + availableSeats +
                ", available=" + available +
                '}';
    }
}
