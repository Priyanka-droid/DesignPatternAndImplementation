package FacadeDesignPattern;

import java.util.ArrayList;
import java.util.Arrays;

public class ChineseRestaurant implements Hotel {

    private ArrayList<String> menuItems= new ArrayList<String>();

    ChineseRestaurant(){
        menuItems.addAll(Arrays.asList("noodles","soup"));
    }
    @Override
    public Menu getMenu() {

        ChineseMenu c= new ChineseMenu();
        for (String item : menuItems) {
            c.setMenuItem(item);
        }
        return c;
    }
    
}
