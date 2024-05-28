package FacadeDesignPattern;

public class HotelWaiter implements Waiter{

    @Override
    public Menu getAllMenu() {
        Menu c=getChineseMenu();
        Menu i=getItalianMenu();
        var chineseItems=c.getMenuItems();
        var italianItems=i.getMenuItems();
        CombinedMenu comb= new CombinedMenu();
       for (String italian : italianItems) {
         comb.setMenuItem(italian);
       }
       for (String chinese : chineseItems) {
        comb.setMenuItem(chinese);
       }
       return comb;
    }

    @Override
    public Menu getChineseMenu() {
        ChineseRestaurant c= new ChineseRestaurant();
        return c.getMenu();
    }

    @Override
    public Menu getItalianMenu() {
        ItalianRestaurant i= new ItalianRestaurant();
        return i.getMenu();
    }
    
}
