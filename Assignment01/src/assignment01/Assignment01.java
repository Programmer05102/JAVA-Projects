
package assignment01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Assignment01 {

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> courses=new ArrayList<String>();
        ArrayList<Integer> marks=new ArrayList<Integer>();
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A Semester : ");
        sc.next();
        System.out.print("Enter Number of  Courses : ");
        int nocourses=sc.nextInt();
        for(int i=0;i<nocourses;i++){
            System.out.print("Enter a Course "+(i+1)+ " : ");
            courses.add(sc.next());
        }
         for(int i=0;i<nocourses;i++){
            System.out.print("Enter a Marks "+courses.get(i)+ " : ");
            marks.add(sc.nextInt());
        }
        int sum=0;
        for(int i=0;i<nocourses;i++){
            sum+=marks.get(i);
        }
        
        System.out.println("Average Marks : "+sum/nocourses);
        System.out.println("Highest Marks : "+Collections.max(marks));
        System.out.println("Lowest Marks : "+Collections.min(marks));
    }
    
}
