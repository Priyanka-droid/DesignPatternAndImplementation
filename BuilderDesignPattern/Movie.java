package BuilderDesignPattern;

class Movie {
    MovieType movieType;
    String platform;
    int duration;

    Movie(MovieType movieType, String platform, int duration) {
        this.movieType = movieType;
        this.platform = platform;
        this.duration = duration;
    }
}
