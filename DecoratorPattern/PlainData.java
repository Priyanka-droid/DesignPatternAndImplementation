package DecoratorPattern;

class PlainData implements DataSource{

    @Override
    public String read() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void write(String data) {

        System.out.println(data);
        
    }
    
}
