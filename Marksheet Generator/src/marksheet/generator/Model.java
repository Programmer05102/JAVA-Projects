
package marksheet.generator;

import java.sql.*;

public class Model {
    
    Connection con;
    Statement stm;
    ResultSet rt;


        Model() {
         try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/transcript", "root", "");
                stm = con.createStatement();
                System.out.println("Db is connected");
                
            } catch (Exception e) {

                System.out.println(e);
            }

        }
        
       public ResultSet Semester(String sem) {
           try {
               String sql = "SELECT * FROM marksheet,semester WHERE Semester = '"+ sem +"' ";
               rt=stm.executeQuery(sql);
           } catch (Exception e) {
               System.out.println(e);
           }
           return rt;
       }
        
      public void AddSemester(String sem, String sub1, String marks1,
                                          String sub2, String marks2,
                                          String sub3, String marks3,
                                          String sub4, String marks4,
                                          String sub5, String marks5) {
          try {
              String sql = "INSERT INTO `semester`(`Subjects`, `Marks`, `Semester_`) VALUES ('"+ sem +"','"+ sub1 +"','"+ marks1 +"'),"
                      + "                                                                   ('"+ sem +"','"+ sub2 +"','"+ marks2 +"'),"
                      + "                                                                   ('"+ sem +"','"+ sub3 +"','"+ marks3 +"'),"
                      + "                                                                   ('"+ sem +"','"+ sub4 +"','"+ marks4 +"'),"
                      + "                                                                   ('"+ sem +"','"+ sub5 +"','"+ marks5 +"'),";
              stm.executeUpdate(sql);
          } catch (Exception e) {
              System.out.println(e);
          }
      }
              
    public static void main(String[] args){
       Model m=new Model();
      
    }
}
