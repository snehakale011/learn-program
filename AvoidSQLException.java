import java.sql.Connection;
import java.sql.DriverManager;
public class AvoidSQLException 
{
   public static void main(String[]args){
      Connection con = null;
      try {
         con = DriverManager.
         getConnection("jdbc:mysql://localhost:3306/ppa41?useSSL=false", "root", "123456");
         System.out.println("Connection is successful !!!!!");
      } catch(Exception e) {
         e.printStackTrace();
      }
   }
}