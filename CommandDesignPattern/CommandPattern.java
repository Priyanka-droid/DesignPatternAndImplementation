package CommandDesignPattern;

public class CommandPattern {
    public static void main(String[] args) {
        Broker broker= new Broker();
        Stock stock1= new Stock("stock1");
    
        Order buyStock1= new BuyOrderCommand(stock1);
        Order sellStock1= new SellOrderCommand(stock1);
        broker.addOrder(buyStock1,sellStock1);
        broker.placeOrders();
    }
}
