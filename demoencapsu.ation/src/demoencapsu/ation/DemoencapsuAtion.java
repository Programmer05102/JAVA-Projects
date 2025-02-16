
package demoencapsu.ation;

public class DemoencapsuAtion {

    public static void main(String[] args) {
        // TODO code application logic here
        LoginDetails obj=new LoginDetails();
        BankDetails bank=new BankDetails();
        obj.setuserName("Hisham");
        obj.setPassword("1234");
        bank.setid("123-456-789");
        bank.setpin("1234");
        
        System.out.println(obj.getUserName());
        System.out.println(obj.getPassword());
        System.out.println(bank.getId());
        System.out.println(bank.getPin());
    }
    
}
