package AdapterDesignPattern;

class Payment {

    public int pay(DebitCard d,int amount){
       return d.deductAmount(amount);
    } 

}


class DebitCard{
    private int balance;
    // private int amount;

    DebitCard(){}
    DebitCard(int balance){
        this.balance=balance;
    }
    int getBalance(){
        return balance;
    }


    int deductAmount(int amount){
        balance= balance-amount;
        return balance;
    }
}

class UPI{
    private int balance;


    UPI(int balance){
        this.balance=balance;

    }
    int getBalance(){
        return balance;
    }

    int deductAmount(int amount){
        balance-=amount;
        return balance;
    }
}


class UpiAdapter extends DebitCard{
    private UPI u;

    UpiAdapter(UPI u){
        this.u= u;
    }
    @Override 
    int getBalance(){
        return u.getBalance();
    } 


    @Override
    int deductAmount(int amount){
       return u.deductAmount(amount);

    }
    
    
}
