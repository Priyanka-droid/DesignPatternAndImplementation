package AdapterDesignPattern;

public class AdapterPattern {
    public static void main(String[] args) {
       
        Payment p= new Payment();
        UPI u= new UPI(100);
        UpiAdapter ua= new UpiAdapter(u);
        System.out.println(ua.getBalance());
        p.pay(ua,10);
        System.out.println(ua.getBalance());


        
    }
}
