/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Assignment02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> colors=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Black");
        System.out.println("List Of Colors : ");
        for(String i:colors){
            System.out.println(i);
        }
        System.out.println("List of Operations : ");
        System.out.println("1. You Wanna to Add more Color ");
        System.out.println("2. You Wanna Remove Any Color ");
        System.out.println("3. You Wanna Remove All Color ");
        System.out.println("4. You Wanna Update Color ");
        System.out.println("5. You Wanna Sort Color ");
        System.out.println("6. You Wanna Find Duplicate Colors ");
        
        System.out.print("Enter Your Operation : ");
        int op=sc.nextInt();
        top:
        
        if(op==1){
            System.out.print("Enter How Many Colors : ");
            int no=sc.nextInt();
            for(int i=1;i<=no;i++){
            colors.add(sc.next());
        }
            
    }
        else if (op==2){
            System.out.print("Enter Index of Color : ");
            int index=sc.nextInt();
            colors.remove(index);
            
        }
        else if (op==3){
            colors.removeAll(colors);
        }
        else if (op==4){
            System.out.print("Enter Index You Want to Update : ");
            int update=sc.nextInt();
            System.out.print("Enter Color You Want to Update : ");
            String cupdate=sc.next();
            colors.set(update, cupdate);
        }
        else if(op==5){
            Collections.sort(colors);
        }
        else if(op==6){
            colors.clone();
        }
        else {
            System.out.println("Invalid Entry");
        }
        System.out.println(colors);
            
    }
    
}
