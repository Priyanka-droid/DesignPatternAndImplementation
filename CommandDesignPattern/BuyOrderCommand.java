package CommandDesignPattern;

//concrete command

public class BuyOrderCommand implements Order{

    private Stock stock;
    public BuyOrderCommand(Stock stock){
        this.stock=stock;
    }
    @Override
    public void execute() {
        stock.buy();
    }
    
}
