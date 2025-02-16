package cms;

class teacher{


    String Name;
    int Age;
    String department;
    
    
    teacher(String Name,int Age, String department){
        
     this.Name=Name;
     this.Age=Age;
     this.department=department;
     
    }
    public void enrollmentCms(){

        System.out.println(Name);
        System.out.println(Age);
        System.out.println(department);
                
}

    public void accessStudents(String Name,int Age,String department){
        System.out.println(Name);
        System.out.println(Age);
        System.out.println(department);
    }
}

public class Cms {
    public static void main(String[] args) {
        teacher st1=new teacher("Hisham",22,"CS");
        st1.enrollmentCms();
        st1.accessStudents("Abdul",32,"IT");
    }
}
