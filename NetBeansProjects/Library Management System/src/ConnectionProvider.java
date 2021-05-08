import java.sql.*;
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","Mylife@13");
            return con;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
}
