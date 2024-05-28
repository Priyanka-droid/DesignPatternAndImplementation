package FacadeDesignPattern;

import java.util.ArrayList;

public class ChineseMenu implements Menu{

    private ArrayList<String> menuItems= new ArrayList<String>();
    @Override
    public ArrayList<String> getMenuItems() {
        return menuItems;
    }

    @Override
    public void setMenuItem(String name) {
        menuItems.add(name);
        
    }
    
}
