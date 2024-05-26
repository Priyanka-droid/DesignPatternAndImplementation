import java.util.Scanner;

public class AbstractFactoryMethod {
    public static void main(String[] args) {
        try{
            CookApp c= new CookApp();
            c.startCooking();
        }catch (Exception e){
            e.getMessage();
        }


    }
}

class CookApp{
    void startCooking() throws Exception{
        Scanner sc= new Scanner(System.in);
        String food= sc.nextLine();
        CookFactory cf;
        switch(food){
            case "Italian":{
                cf= new ItalianCookFactory();
            }break;
            case "French":{
                cf= new FrenchCookFactory();
            }break;
            default:{
                throw new Exception("we don't cook it here!!");
            }
        }

        Starters s=cf.createStarters();
        Drinks d= cf.prepareDrinks();
        s.prepare();
        d.prepare();
    }
}


interface CookFactory{
    Starters createStarters();
    Drinks prepareDrinks();

}

class ItalianCookFactory implements CookFactory{
    public Starters createStarters(){
        return new ItalianStarters();
    }

    public Drinks prepareDrinks(){
        return new ItalianDrinks();
    }
}

class FrenchCookFactory implements CookFactory{

    public Starters createStarters() {
        return new FrenchStarters();
    }

    public Drinks prepareDrinks() {
        return new FrenchDrinks();
    }
}

interface Starters{
    public void prepare();
}
class ItalianStarters implements Starters{
    public void prepare(){
        System.out.println("Some cheese garlic breads maybe??");
    }
}

class FrenchStarters implements Starters{
    public void prepare(){
        System.out.println("is steak french??? a steak");
    }
}

interface Drinks{
    public void prepare();
}

class ItalianDrinks implements Drinks{
    public void prepare(){
        System.out.println("some stupid italian drink, if there is any");
    }
}

class FrenchDrinks implements Drinks{
    public void prepare(){
        System.out.println("some stupid french drink, again...if there is any");
    }
}






