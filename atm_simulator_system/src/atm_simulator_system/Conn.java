package atm_simulator_system;
import java.sql.*;
public class Conn {
    Connection c;
    Statement s;
   public Conn(){
      try{
          //register the driver
          //connector used
          //Class.forName(com.mysql.cj.jdbc.Driver);
          //create connection-->by default local host 3306-->so put /
          c=DriverManager.getConnection("jdbc:mysql:///atmsimulatorsystem","root", "Harsh#2010");
          //create statement
          s=c.createStatement();
          
      }  catch(Exception e){
          System.out.println(e);
      }
   } 
}
