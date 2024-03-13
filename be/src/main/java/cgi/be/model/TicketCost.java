package cgi.be.model;

public class TicketCost {

    private Long id;
    private Integer regular;
    private Integer discount;

    public TicketCost(){

    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setRegular(Integer regular) {
        this.regular = regular;
    }

    public Integer getRegular() {
        return regular;
    }

    @Override
    public String toString() {
        return "TicketCost{" +
                "id=" + id +
                ", regular=" + regular +
                ", discount=" + discount +
                '}';
    }
}
