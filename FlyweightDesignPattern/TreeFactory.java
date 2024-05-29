package FlyweightDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    static Map<String, TreeType> treeMap = new HashMap<String, TreeType>();

   static TreeType getTreeType(String name, String color, String texture) {
        TreeType t = treeMap.get(name);
        if (t == null) {
            t = new TreeType(name, color, texture);
            treeMap.put(name, t);

        }
        return t;

    }
}
