package BridgePattern;

public class BridgePattern {
    public static void main(String[] args) {
        Patient p= new DentalPatient();
        Doctor d= new Doctor(p);
        d.setPatientInfo("dental patient A", 10);
        System.out.println("is patient sick:"+p.isSick());
        d.treatment("med a", "test a");
        d.treatPatient();
        
        System.out.println("all properties of dental patient" + "\n age:"+p.getAge()+"\n name:"+p.getPatientName()+ "\n medicine:"+ p.getMedicine()+ "\n test:"+p.getTest()+"\n sickness status:"+ p.isSick()) ;


        Patient ph= new PhysicianPatient();
        Doctor dp= new Doctor(ph);
        dp.setPatientInfo("physician patient 1", 20);
        System.out.println("is patient sick:"+ph.isSick());
        dp.treatment("med2", "test2");
        dp.treatPatient();
       
        System.out.println("all properties of dental patient" + "\n age:"+ph.getAge()+"\n name:"+ph.getPatientName()+ "\n medicine:"+ ph.getMedicine()+ "\n test:"+ph.getTest()+"\n sickness status:"+ ph.isSick()) ;

        
    }
}
