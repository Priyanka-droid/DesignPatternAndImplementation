package DecoratorPattern;

public class Wrapper1 extends DataSourceDecorator{

    Wrapper1(DataSource data){
        super(data);
    }
    @Override
    public String read() {
        // TODO Auto-generated method stub
        return super.read();
    }

    @Override
    public void write(String data) {

        super.write(append(data));
        
    }

    String append(String data){
        return String.format("{wrapper1:%s}", data);
    }
    
}
