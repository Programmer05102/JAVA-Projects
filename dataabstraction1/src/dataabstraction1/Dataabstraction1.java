package dataabstraction1;


//data abstraction
//1 abstractclass
//2 interface

/*abstract class ATMOperations1 {
    
    abstract void CreditCardPayment();
    
}

abstract class ATMOperations2 {
    
    abstract void Cashwithdraw();
    abstract void Fundtransfer();
    void ATMFee(){}
    
}

class SCBATM extends ATMOperations1,ATMOperations2 {
    
    void Cashwithdraw(){}
    void Fundtransfer(){}

    void CreditCardPayment(){}
    
}*/


public class Dataabstraction1 {

    public static void main(String[] args) {
        // TODO code application logic here
    
    SCBATM t=new SCBATM();
    t.ATMFee();
    }
    
}


interface ATMOperation1 {
public void FundTransfer();
public void WithDraw();

}

interface ATMOperation2 {
public void ATMFee();

}

class SCBATM implements ATMOperation1,ATMOperation2 {
    public void FundTransfer(){}
    public void WithDraw(){}
    public void ATMFee(){}
}