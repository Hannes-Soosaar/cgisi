package cgi.be.repositry.mapper;

import cgi.be.model.Schedule;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ScheduleMapper implements RowMapper<Schedule> {
    //    TODO change the data and time data types.
    @Override
    public Schedule mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Schedule schedule = new Schedule();
        schedule.setId(resultSet.getLong("id"));
        schedule.setDate(resultSet.getInt("date"));
        schedule.setTime(resultSet.getInt("time"));
        schedule.setMovieScreeningId(resultSet.getInt("movie_screening_id"));
        return schedule;
    }
}
