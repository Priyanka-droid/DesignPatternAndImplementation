package CommandDesignPattern;

//concrete command
public class SellOrderCommand implements Order{

    //refernce to receiever
    private Stock stock;
    public SellOrderCommand(Stock stock){
        this.stock=stock;
    }
    @Override
    public void execute() {
       
        stock.sell();
    }
    
}
