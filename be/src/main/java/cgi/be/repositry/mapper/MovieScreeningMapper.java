package cgi.be.repositry.mapper;

import cgi.be.model.MovieScreening;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MovieScreeningMapper implements RowMapper<MovieScreening> {
    @Override
    public MovieScreening mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        MovieScreening movieScreening = new MovieScreening();
        movieScreening.setId(resultSet.getLong("id"));
        movieScreening.setMovieID(resultSet.getInt("movie_id"));
        movieScreening.setScreenId(resultSet.getInt("screen_id"));
        movieScreening.setTicketCostId(resultSet.getInt("ticket_cost_id"));
        return movieScreening;
    }
}
