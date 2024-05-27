package DecoratorPattern;

class Wrapper2 extends DataSourceDecorator {

    Wrapper2(DataSource data){
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
        return String.format("{wrapper2:%s}", data);
    }
    
}
