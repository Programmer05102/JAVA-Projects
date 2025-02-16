
package javaapplication2;

class student{

    int age;
    String Name;
    float cgpa;
    String Department;
    
 student(String Name,int age){
   
     this.Name=Name;
     this.age=age;
 }  
    public void enrollment(){
        
        System.out.println(Name);
        System.out.println(age);
    }

    
    public void transcript(){

}

    
    public void courseeve(){
        
    }
}
/**
 *
 * @author hp
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        student st1=new student("Ali",22);
        st1.enrollment();
        }
}
