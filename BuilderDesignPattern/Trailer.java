package BuilderDesignPattern;

class Trailer {
    MovieType movieType;
    String platform;
    int duration;

    Trailer(MovieType movieType, String platform, int duration) {
        this.movieType = movieType;
        this.platform = platform;
        this.duration = duration;
    }
}
