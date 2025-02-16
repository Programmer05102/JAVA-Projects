
package demoencapsu.ation;
public class LoginDetails {
   
    private String UserName;
    private String Password;
    
    public void setuserName(String UserName){
        
        this.UserName=UserName;
    }
 
    public void setPassword(String Password){
        
        this.Password=Password;
    }
    
    public String getUserName(){
        
        return UserName;
    }
    public String getPassword(){
        
        return Password;
    }
}

 class BankDetails {
    
    private String Id;
    private String Pin;
    
    public void setid(String Id){
        
        this.Id=Id;
        
    }
    
    public void setpin(String Pin){
        
        this.Pin=Pin;
    }
    
    public String getId(){
        return Id;
    }
    public String getPin(){
        return Pin;
    }
}