
package inventoryapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {
    public static Connection getConnection(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Inventoryappdb","root","");
        }
        catch(ClassNotFoundException | SQLException ae){
            System.out.println(ae);    
        }
        return con;       
    }
}

