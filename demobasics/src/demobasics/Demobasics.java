package demobasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Demobasics {
    
    
    public static void main(String[] args) {
      
    Scanner in=new Scanner(System.in);
       ArrayList<String> colors=new ArrayList<String>();
       System.out.print("Enter Number of Colors : ");
       int nc=in.nextInt();
       for(int i=0;i<nc;i++){
  System.out.print("Enter Color "+(i+1)+" : ");
       colors.add(in.next());
       
       }
         System.out.println(colors);
         System.out.println("List of Operations: ");
         System.out.println("1) Remove color: ");
         System.out.println("2) Update Color: ");
          System.out.println("3) Sort Color:");
       
          System.out.println("Enter A Opertion: ");
          int operation=in.nextInt();
       if(operation==1){
          System.out.println("Enter a index you want to remove: ");
          colors.remove(in.nextInt());
            System.out.println(colors);
           
       }else if (operation==2){
         System.out.println("Enter a index you want to update: ");
         int index=in.nextInt();
         System.out.println("Enter a color you want to update: ");
           String color=in.next();
           colors.set(index,color);
           System.out.println(colors); }
           else if (operation==3){
             Collections.sort(colors);     
             System.out.println(colors);      
                   
                        
       }
    }
}