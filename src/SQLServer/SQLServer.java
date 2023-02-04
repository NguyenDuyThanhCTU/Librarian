/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQLServer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class SQLServer {
    
    public static Connection Connection() throws ClassNotFoundException, SQLException{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String dbUrl = "jdbc:sqlserver://MSI\\\\SQLEXPRESS:1433;databaseName=Librarian;user=sa;password=123456";
        Connection con = DriverManager.getConnection(dbUrl);
        
        return con;
        
    }
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        Statement s = Connection().createStatement();
        ResultSet rs = s.executeQuery("select Mathe from NguoiDung where HoTen = 'Pham Bao Tri'");
        while(rs.next()){
            System.out.println("Mathe = " + rs.getString("Mathe"));
        }
        
        Connection().close();
    } 
    
}
