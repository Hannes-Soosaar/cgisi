package cgi.be.model;

public class Movie {

    private Long id;
    private boolean languageEn;
    private boolean languageEst;
    private boolean languageRus;
    private boolean subtitlesEn;
    private boolean subtitlesEst;
    private boolean subtitlesRus;
    private Integer length;
    private Integer movieGenreId;
    private String description;
    private String poster;
    private String trailer;

    public Movie() {
    }

    //    used GPT to create the getters and setters from the list of variables.
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isLanguageEn() {
        return languageEn;
    }

    public void setLanguageEn(boolean languageEn) {
        this.languageEn = languageEn;
    }

    public boolean isLanguageEst() {
        return languageEst;
    }

    public void setLanguageEst(boolean languageEst) {
        this.languageEst = languageEst;
    }

    public boolean isLanguageRus() {
        return languageRus;
    }

    public void setLanguageRus(boolean languageRus) {
        this.languageRus = languageRus;
    }

    public boolean isSubtitlesEn() {
        return subtitlesEn;
    }

    public void setSubtitlesEn(boolean subtitlesEn) {
        this.subtitlesEn = subtitlesEn;
    }

    public boolean isSubtitlesEst() {
        return subtitlesEst;
    }

    public void setSubtitlesEst(boolean subtitlesEst) {
        this.subtitlesEst = subtitlesEst;
    }

    public boolean isSubtitlesRus() {
        return subtitlesRus;
    }

    public void setSubtitlesRus(boolean subtitlesRus) {
        this.subtitlesRus = subtitlesRus;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getMovieGenreId() {
        return movieGenreId;
    }

    public void setMovieGenreId(Integer movieGenreId) {
        this.movieGenreId = movieGenreId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", languageEn=" + languageEn +
                ", languageEst=" + languageEst +
                ", languageRus=" + languageRus +
                ", subtitlesEn=" + subtitlesEn +
                ", subtitlesEst=" + subtitlesEst +
                ", subtitlesRus=" + subtitlesRus +
                ", length=" + length +
                ", movieGenreId=" + movieGenreId +
                ", description='" + description + '\'' +
                ", poster='" + poster + '\'' +
                ", trailer='" + trailer + '\'' +
                '}';
    }
}

