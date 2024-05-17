package BuilderDesignPattern;

class Director {
    void createActionMovie(Builder b, String platform, int duration) {
        b.setMovieType(MovieType.ACTION);
        b.setPlatform(platform);
        b.setDuration(duration);
    }

    void createDramaMovie(Builder b, String platform, int duration) {
        b.setMovieType(MovieType.DRAMA);
        b.setPlatform(platform);
        b.setDuration(duration);
    }

    void createGoreMovie(Builder b, String platform, int duration) {
        b.setMovieType(MovieType.GORE);
        b.setPlatform(platform);
        b.setDuration(duration);
    }
}
