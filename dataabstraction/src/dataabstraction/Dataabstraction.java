package dataabstraction;


abstract class Netbanking {
    
    abstract void fundTransfer();
    abstract void withDraw();
    abstract void atmFee();
    
    
    
}

class hbl extends Netbanking {
    
     void fundTransfer(){}
     void withDraw(){}
     void atmFee(){}
}

class nbp extends Netbanking {
    
     void fundTransfer(){}
     void withDraw(){}
     void atmFee(){}
}


public class Dataabstraction {

    public static void main(String[] args) {
        // TODO code application logic here
           hbl h=new hbl();
        //Netbanking nt=new Netbanking();
        
    }
    
}
