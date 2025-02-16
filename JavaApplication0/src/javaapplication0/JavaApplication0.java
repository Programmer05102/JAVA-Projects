
package javaapplication0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class JavaApplication0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> names=new ArrayList<Integer>();
        Scanner in=new Scanner(System.in);
        for(int i=1;i<6;i++){
            System.out.print("Enter The number "+i+" : ");
         names.add(in.nextInt());
     //} 
        
        /*names.add(13);
        names.add(31);
        names.add(32);
        names.add(33);
        names.add(5);*/
        
        Collections.sort(names);
        /*System.out.println(Collections.max(names));
        System.out.println(Collections.min(names));
        for(int n : names){
            System.out.println(n);
        }
        Collections.reverse(names);
          for(int n : names){
            System.out.println(n);
        }*/
         System.out.println(names);
        }
    }
}
