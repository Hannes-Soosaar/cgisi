package cgi.be.repositry.mapper;

import cgi.be.model.Seat;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SeatMapper implements RowMapper<Seat> {
    @Override
    public Seat mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Seat seat = new Seat();
        seat.setId(resultSet.getLong("id"));
        seat.setScreenId(resultSet.getInt("screen_id"));
        seat.setRow(resultSet.getString("row"));
        seat.setSeat(resultSet.getInt("seat"));
        seat.setAvailable(resultSet.getBoolean("available"));
        return seat;
    }
}
