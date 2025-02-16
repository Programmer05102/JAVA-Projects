
package q;
import java.util.Scanner;
public class Q3 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        int num1,num2,num3,bigger,smaller;
        System.out.print("Enter First Number : ");
        num1=in.nextInt();
        System.out.print("Enter Second Number : ");
        num2=in.nextInt();
        System.out.print("Enter Third Number : ");
        num3=in.nextInt();
        System.out.println("The Sum is : "+(num1+num2+num3));
        System.out.println("The Average is : "+(num1+num2+num3)/3);
        System.out.println("The Product is : "+num1*num2*num3);
        bigger=num1>num2?num1:num2;
        bigger=bigger>num3?bigger:num3;
        smaller=num1<num2?num1:num2;
        smaller=smaller<num3?smaller:num3;
        System.out.println("The Smaller is : "+smaller);
        System.out.println("The Bigger is : "+bigger);
        
    }
    
}
