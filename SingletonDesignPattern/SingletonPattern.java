package SingletonDesignPattern;

public class SingletonPattern {
    public static void main(String[] args) {
        Singleton s= Singleton.getInstance();
        Singleton.getInstance();
        Singleton.getInstance();

    }
}

class Singleton{
    private static Singleton instance=null;

    private Singleton(){
        System.out.println("singleton instance created");
    }
    public static Singleton getInstance(){
        if(instance==null)
        {
            instance=new Singleton();
        }
        return instance;
    } 

}
