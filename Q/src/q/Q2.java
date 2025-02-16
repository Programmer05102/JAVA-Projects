
package q;
import java.util.Scanner;
public class Q2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        double celsius,fahrenheit = 0.0;
        System.out.print("Enter Temp in Fahrenheit : ");
        fahrenheit=in.nextDouble();
        celsius=(fahrenheit - 32.0) * (5.0 / 9.0);
        System.out.println("Temp in celsius is : "+celsius);
    }
    
}
