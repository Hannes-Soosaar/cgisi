package cgi.be.repositry.mapper;

import cgi.be.model.Screen;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ScreenMapper implements RowMapper<Screen> {
    @Override
    public Screen mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Screen screen = new Screen();
        screen.setId(resultSet.getLong("id"));
        screen.setTotalSeats(resultSet.getInt("total_seats"));
        screen.setAvailableSeats(resultSet.getInt("available_seats"));
        screen.setAvailable(resultSet.getBoolean("available"));
        return screen;
    }
}
