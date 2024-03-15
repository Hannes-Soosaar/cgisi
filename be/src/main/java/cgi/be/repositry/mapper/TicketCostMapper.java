package cgi.be.repositry.mapper;

import cgi.be.model.TicketCost;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TicketCostMapper implements RowMapper<TicketCost> {
    @Override
    public TicketCost mapRow(ResultSet resultSets, int rowNum) throws SQLException {
        TicketCost ticketCost = new TicketCost();
        ticketCost.setId(resultSets.getLong("id"));
        ticketCost.setRegular(resultSets.getBigDecimal("regular"));
        ticketCost.setDiscount(resultSets.getBigDecimal("discount"));
        return ticketCost;
    }
}
