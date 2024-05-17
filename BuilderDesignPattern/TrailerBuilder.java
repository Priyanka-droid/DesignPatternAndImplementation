package BuilderDesignPattern;

class TrailerBuilder implements Builder {
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

    public Trailer getMovie() {
        return new Trailer(movieType, platform, duration);
    }
}
