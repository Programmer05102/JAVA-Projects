
package javabasic;
//GUI-Grphical User Interface

import java.util.Scanner;


public class JavaBasic {
    public static void main(String[] args) {
        // TODO code application logic here
        String name=null;
        Scanner ip=new Scanner(System.in);
        try{
        
        System.out.println(ip.nextInt());
        }
        catch(Exception e){
            System.out.println(e);
        }        
         try{
        
        System.out.println(100/0);
        }
        catch(Exception e){
            System.out.println(e);
        }       
          try{
        
        System.out.println(name.charAt(0));
        }
        catch(Exception e){
            System.out.println(e);
        }
           int a[]={1,2};
           try{
        
        System.out.println(a[2]);
        }
        catch(Exception e){
            System.out.println(e);
        }   
           String b="1";
           try{
               System.out.println(b.charAt(4));
           }
           catch(Exception e){
               System.out.println(e);
           }
                }
       
    
}
