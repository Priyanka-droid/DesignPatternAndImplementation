package FacadeDesignPattern;

import java.util.ArrayList;

public class FacadeDesignPattern {
    public static void main(String[] args) {
        Waiter w= new HotelWaiter();
         System.out.println(w.getChineseMenu().getMenuItems());

         System.out.println(w.getItalianMenu().getMenuItems());

        System.out.println(w.getAllMenu().getMenuItems());

    }
}
