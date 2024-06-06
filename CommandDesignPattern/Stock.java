package CommandDesignPattern;

//receiver
public class Stock {
    private String name;

    public Stock(String name) {
        this.name = name;
    }

    public void buy() {
        System.out.println(String.format("stock bought :%s", name));
    }

    public void sell() {
        System.out.println(String.format("stock sold :%s", name));
    }
}
