package cgi.be.model;

import java.math.BigDecimal;

public class TicketCost {

    private Long id;
    private BigDecimal regular;
    private BigDecimal discount;

    public TicketCost(){

    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setRegular(BigDecimal regular) {
        this.regular = regular;
    }

    public BigDecimal getRegular() {
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
