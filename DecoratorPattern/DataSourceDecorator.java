package DecoratorPattern;

public class DataSourceDecorator implements DataSource{
    private DataSource wrap;

  
    @Override
    public String read() {
        // TODO Auto-generated method stub
        return wrap.read();
    }


    @Override
    public void write(String data) {
        wrap.write(data);
        
    }


    DataSourceDecorator(DataSource wrap){
        this.wrap=wrap;
    }

    
}
