
package tryingmatrix;

import java.util.ArrayList;
import java.util.Scanner;

public class TryingMatrix {
    ArrayList<Integer> matA=new ArrayList<Integer>();
    ArrayList<Integer> matB=new ArrayList<Integer>();
    ArrayList<Integer> matC=new ArrayList<Integer>();
public void addMatrix(){
    matA.add(2);
    matA.add(4);
    matA.add(3);
    matA.add(5);
    matB.add(2);
    matB.add(4);
    matB.add(3);
    matB.add(5);
} 
public void additionMatrix(){
  for(int i=0;i<4;i++){ 
      matC.add(matA.get(i)+matB.get(i));
             }
        }
public void subtractionMatrix(){
    matC.clear();
  for(int i=0;i<4;i++){ 
      matC.add(matA.get(i)-matB.get(i));
             }
        }
public void displayAddMatrix(){
           System.out.println("Addition");
           System.out.println("Matrix A : "+matA);
           System.out.println("Matrix B : "+matB);
           System.out.println("Matrix C : "+matC);
           System.out.println();
    }
public void displaySubMAtrix(){
           System.out.println("Subtraction");
           System.out.println("Matrix A : "+matA);
           System.out.println("Matrix B : "+matB);
           System.out.println("Matrix C : "+matC);
           System.out.println();
}
public void displayMatrix(){
    System.out.println(matA);
    System.out.println(matB);
}
    public static void main(String[] args) {
        // TODO code application logic here
        TryingMatrix t=new TryingMatrix();
        Scanner sc=new Scanner(System.in);
        //System.out.print("Enter a number of Matrix : ");
        //sc.nextInt();    
        System.out.println("List of Operations");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Display");
        System.out.print("Enter Your Option : ");
        int op=sc.nextInt();
        t.addMatrix();
        switch (op) {
            case 1:
                t.additionMatrix();
                t.displayAddMatrix();
                break;
            case 2:
                t.subtractionMatrix();
                t.displaySubMAtrix();
                break;
            case 3:
                t.displayMatrix();
                break;
            default:
                System.out.println("Invalid Entry");
                break;
        }
    }
}
    
