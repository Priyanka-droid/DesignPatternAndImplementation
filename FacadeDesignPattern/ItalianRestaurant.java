package FacadeDesignPattern;

import java.util.ArrayList;
import java.util.Arrays;

public class ItalianRestaurant implements Hotel{

    private ArrayList<String> menuItems=new ArrayList<String>();

    ItalianRestaurant(){
        menuItems.addAll(Arrays.asList("pasta","pizza"));
    }
    @Override
    public Menu getMenu() {

        ItalianMenu i= new ItalianMenu();
        for (String item : menuItems) {
            i.setMenuItem(item);
        }
        return i;
    }
    
}
