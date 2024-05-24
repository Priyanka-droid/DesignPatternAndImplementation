package BridgePattern;

class Doctor {
    Patient p;
    Doctor(Patient p){
        this.p=p;
    }

    void setPatientInfo(String name, int age){
        p.setPatientName(name);
        p.setAge(age);
    }

    void treatPatient(){
        if(p.isSick()){
            p.declareHealthy();
        }
    }

    void treatment(String med, String test){
        if(p.isSick()){
            p.setMedicine(med);
            p.recommendTest(test);
        }
    }





}
