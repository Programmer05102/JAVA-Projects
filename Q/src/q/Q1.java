
package q;
import java.util.Scanner;
public class Q1 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        int num1,num2,num3;
        System.out.print("Enter First Number : ");
        num1=in.nextInt();
        System.out.print("Enter Second Number : ");
        num2=in.nextInt();
        System.out.print("Enter Third Number : ");
        num3=in.nextInt();
        System.out.println("The Product of Three Numbers is : "+num1*num2*num3);
    }
    
}
