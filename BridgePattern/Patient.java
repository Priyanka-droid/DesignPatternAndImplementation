package BridgePattern;

interface  Patient {
    
    void declareSick();
    void declareHealthy();
    boolean isSick();
    void setMedicine(String med);
    void recommendTest(String test);
    void setPatientName(String name);
    void setAge(int age);
    String getMedicine();
    String getTest();
    String getPatientName();
    int getAge();
    
}


class DentalPatient implements Patient{
    private String medicine;
    private String test;
    private String name;
    private int age;
    private boolean sickness;

    DentalPatient(){
        declareSick();
    }
    public void declareSick(){
        sickness=true;
    }
    public boolean isSick(){
        return sickness;
    }

    public void declareHealthy(){
        sickness=false;
    }
    public void setMedicine(String med){
        this.medicine=med;
    }

    public void recommendTest(String test){
        this.test=test;
    }

    public void setPatientName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }

    public String getMedicine(){
        return medicine;
    }
    public String getTest(){
        return test;
    }
    public String getPatientName(){
        return name;
    }
    public int getAge(){
        return age;
    }

}


class PhysicianPatient implements Patient{
    private String medicine;
    private String test;
    private String name;
    private int age;
    private boolean sickness;

    PhysicianPatient(){
        declareSick();
    }
    public boolean isSick(){
        return sickness;
    }

    public void declareSick(){
        sickness=true;
    }
    public void declareHealthy(){
        sickness=false;
    }
    public void setMedicine(String med){
        this.medicine=med;
    }

    public void recommendTest(String test){
   
        this.test=test;
    }

    public void setPatientName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }

    public String getMedicine(){
        return medicine;
    }
    public String getTest(){
        return test;
    }
    public String getPatientName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}