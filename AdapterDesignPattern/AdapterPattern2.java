package AdapterDesignPattern;

public class AdapterPattern2 {
    public static void main(String[] args) {
        Car c=new Car(100,10);
        DrivingMeterCalculator d= new DrivingMeterCalculator();
        System.out.println(d.calculatePrice(c));

        Bike b= new Bike(20, 6);
        BikeAdapter ba= new BikeAdapter(b);
       System.out.println( d.calculatePrice(ba));
    }
    
}
