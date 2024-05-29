package FlyweightDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Forest {
    private List<Tree> trees= new ArrayList<Tree>();
    public void plantTrees(int x, int y, String color, String name, String texture){
        TreeType t= TreeFactory.getTreeType(name, color, texture);
        Tree tree= new Tree(x, y, t);
        trees.add(tree);

    }

    public void drawForest(){
        for (Tree tree : trees) {
            tree.draw();
        }
    }
}
