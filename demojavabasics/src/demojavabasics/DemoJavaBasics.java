package demojavabasics;
public class DemoJavaBasics {
    public static void main(String[] args) {
        // TODO code application logic here
       int num1;
       float cgpa;
       double cg;
       boolean status;
       String Name="hello world";
       
       //loops 1)for 2)while3) dowhile 4)foreach
       System.out.println("hello world");
       
       
       
       int [][]MA={{1, 5}, {6, 7}};
             /*
      for(int i=0;i<MA.length;i++){
          for(int j=0;j<MA.length;j++){
          System.out.print(MA[i][j]+"      ");
          }
          
          System.out.println();
      }
      */
      /*
      int i=0;
      while(i<MA.length){
      
      
      int j=0;
      while(j<MA.length){
          System.out.println(MA[i][j]);
     
       j++;
      
      
      }
      
      i++;
      }
      */
      
       
      //System.out.println(MA[1][0]);
       
      /*
      int i=0;do{
      
        int j=0;do{
      
          System.out.print(MA[i][j]+"   ");
      j++;
      }while(j<MA.length); 
      System.out.println();
        i++;
      }while(i<MA.length);
      
   */
     
      
      for(int num[]:MA){
          
          for(int value:num){
              
              System.out.println(value);
          }
      
      }
      
      
      
    }
    
}