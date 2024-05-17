package BuilderDesignPattern;

class MovieBuilder implements Builder {
    MovieType movieType;
    String platform;
    int duration;

    public void setMovieType(MovieType movieType) {
        this.movieType = movieType;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Movie getMovie() {
        return new Movie(movieType, platform, duration);
    }
}
