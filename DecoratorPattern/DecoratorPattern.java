package DecoratorPattern;

public class DecoratorPattern {
    public static void main(String[] args) {
        DataSourceDecorator wrap2= new Wrapper2(new Wrapper1(new PlainData()));
        wrap2.write("some data");
    }
}
 