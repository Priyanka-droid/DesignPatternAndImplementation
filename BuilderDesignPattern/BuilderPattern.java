package BuilderDesignPattern;

public class BuilderPattern {
    public static void main(String[] args) {
        MovieBuilder mb = new MovieBuilder();
        Director d = new Director();
        d.createActionMovie(mb, "PRIME", 30);
        Movie m = mb.getMovie();
        System.out.println(m.movieType);
        System.out.println(m.platform);
        System.out.println(m.duration);

        TrailerBuilder tb = new TrailerBuilder();
        d.createActionMovie(tb, "YOUTUBE", 5);
        Trailer t = tb.getMovie();
        System.out.println(t.movieType);
        System.out.println(t.platform);
        System.out.println(t.duration);

    }
}









