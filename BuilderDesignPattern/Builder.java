package BuilderDesignPattern;

interface Builder {
    void setMovieType(MovieType movieType);

    void setPlatform(String platform);

    void setDuration(int duration);
}