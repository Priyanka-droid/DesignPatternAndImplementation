package AdapterDesignPattern;

class DrivingMeterCalculator{
    int  calculatePrice(Car c){
        return c.getChargePerKm() * c.getTravelledDistance();
    }
}


class Car{
    private int travelledDistance;
    private int chargePerKm;

    Car(){

    }
    Car(int travelledDistance, int chargePerKm){
        this.travelledDistance=travelledDistance;
        this.chargePerKm=chargePerKm;
    }
    public int getTravelledDistance(){
        return travelledDistance;
    }

    public int getChargePerKm(){
        return chargePerKm;
    }

    
}

class Bike{
    private int travelledDistance;
    private int chargePerKm;

    Bike(int travelledDistance, int chargePerKm){
        this.travelledDistance=travelledDistance;
        this.chargePerKm=chargePerKm;
    }
    public int getTravelledDistance(){
        return travelledDistance;
    }

    public int getChargePerKm(){
        return chargePerKm;
    } 
}


class BikeAdapter extends Car{
    private Bike b;
    BikeAdapter(Bike b){
        this.b=b;
    }
    public int getTravelledDistance(){
        return b.getTravelledDistance();
    }

    public int getChargePerKm(){
        return b.getChargePerKm();
    } 
}