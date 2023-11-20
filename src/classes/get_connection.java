
package classes;

import java.sql.*;


public class get_connection {
    
    public static Connection connect(){
        try {
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db_sena", "root", "");
            return cn;
            
            
        } catch (SQLException e) {
            System.out.println("Database Connection Error!" + e);
        }
        return(null);
        
    }
    
}
