package FlyweightDesignPattern;

//flyweght object
public class TreeType {
    private String name;
    private String color;
    private String texture;

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    void draw(int x, int y) {
        System.out.println(String.format("draw:%s at %d %d", name, x, y));
    }
}
