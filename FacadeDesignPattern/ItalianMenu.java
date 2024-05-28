package FacadeDesignPattern;

import java.util.ArrayList;

public class ItalianMenu implements Menu{

    private ArrayList<String> menuItems=new ArrayList<String>();
    @Override
    public ArrayList<String> getMenuItems() {
        return menuItems;
    }

    @Override
    public void setMenuItem(String name) {
        menuItems.add(name);
        
    }
    
}
