package cgi.be.repositry.mapper;

import cgi.be.model.MovieGenre;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MovieGenreMapper implements RowMapper<MovieGenre> {
    @Override
    public MovieGenre mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        MovieGenre movieGenre = new MovieGenre();
        movieGenre.setId(resultSet.getLong("id"));
        movieGenre.setMovieID(resultSet.getInt("movie_id"));
        movieGenre.setGenreId (resultSet.getInt("genre_id"));
        return movieGenre;
    }
}
