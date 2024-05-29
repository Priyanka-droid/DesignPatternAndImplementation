package FlyweightDesignPattern;

public class FlyweightDesignPattern {
    public static void main(String[] args) {
        Forest f = new Forest();
        f.plantTrees(0, 0, "red", "redTree", "redTreeTexture");
        f.plantTrees(1, 1, "pink", "pinkTree", "pinkTreeTexture");
        f.plantTrees(2, 2, "red", "redTree", "redTreeTexture");
        f.plantTrees(3, 3, "green", "greenTree", "greenTreeTexture");
        f.drawForest();
    }
}
