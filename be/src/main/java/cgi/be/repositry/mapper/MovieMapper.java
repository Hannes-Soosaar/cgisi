package cgi.be.repositry.mapper;

import cgi.be.model.Movie;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MovieMapper implements RowMapper<Movie> {
    @Override
    public Movie mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Movie movie = new Movie();
        movie.setId(resultSet.getLong("id"));
        movie.setLanguageEn(resultSet.getBoolean("language_en"));
        movie.setLanguageEst(resultSet.getBoolean("language_est"));
        movie.setLanguageRus(resultSet.getBoolean("language_rus"));
        movie.setSubtitlesEn(resultSet.getBoolean("subtitles_en"));
        movie.setSubtitlesEst(resultSet.getBoolean("subtitles_est"));
        movie.setSubtitlesRus(resultSet.getBoolean("subtitles_rus"));
        movie.setLength(resultSet.getInt("length"));
        movie.setMovieGenreId(resultSet.getInt("movie_genre_id"));
        movie.setDescription(resultSet.getString("description"));
        movie.setPoster(resultSet.getString("poster"));
        movie.setTrailer(resultSet.getString("trailer"));
        return movie;
    }
}
