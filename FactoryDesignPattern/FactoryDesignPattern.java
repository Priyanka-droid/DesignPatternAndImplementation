package FactoryDesignPattern;
import java.util.Scanner;

public class FactoryDesignPattern {
    public static void main(String[] args) {
        try {
            Logistics.dealWithLogistic();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

class Logistics {
    static void dealWithLogistic() throws Exception {
        Scanner sc = new Scanner(System.in);
        String transportMode = sc.nextLine();
        sc.close();

        TransportLogistic t;
        switch (transportMode) {
            case "ship": {
                t = new ShipLogisticc();
            }
                break;
            case "truck": {
                t = new TruckLogistic();
            }
                break;
            default: {
                throw new Exception("go deliver it on your back!!!!");
            }
        }
        System.out.println(t.findDeliveryPrice());
        t.showDeliveryMessage();

    }
}

// creator class
abstract class TransportLogistic {

    int findDeliveryPrice() {
        Mode m = createLogistic();
        return m.deliverPrice();
    }

    void showDeliveryMessage() {
        Mode m = createLogistic();
        m.deliverMessage();
    }

    // factory method
    abstract Mode createLogistic();
}

// concrete CreatorA
class TruckLogistic extends TransportLogistic {
    Mode createLogistic() {
        return new Truck();
    }
}

// concrete creatorB
class ShipLogistic extends TransportLogistic {
    Mode createLogistic() {
        return new Ship();
    }
}

// product interface
interface Mode {
    public void deliverMessage();

    public int deliverPrice();

}

// concrete product A
class Ship implements Mode {
    public void deliverMessage() {
        System.out.println("deliver with ship");
    }

    public int deliverPrice() {
        return 10;
    }

}

// concrete product B
class Truck implements Mode {
    public void deliverMessage() {
        System.out.println("deliver with truck");
    }

    public int deliverPrice() {
        return 20;
    }

}
