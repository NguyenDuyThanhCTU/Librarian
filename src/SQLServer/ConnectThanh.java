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
        

/**
 *
 * @author thanh
 */
public class ConnectThanh {
    //private Connection conn;
    
    public static Connection Connection() throws ClassNotFoundException, SQLException{
        //Đăng ký JDBC
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;databasename=Librarian;user=sa;password=1234";
        //Thực hiện kết nối
        Connection conn = DriverManager.getConnection(url);       
   
        return conn;
    }
    
        public static void main(String[] args) throws ClassNotFoundException, SQLException{
        Statement statement = Connection().createStatement();
//        statement.execute("Insert into Nguoidung values('2','Le Nguyen Kim Trang','0123456789','lnkt12412@gmail.com','CanTho')");
//        statement.execute("insert into Nguoidung values('4','Tri','0123456789','Khang@gmail.com','CanTho')");
//        ResultSet rs = s.executeQuery("select Mathe from NguoiDung where HoTen = 'Pham Bao Tri'");
//        while(rs.next()){
//            System.out.println("Mathe = " + rs.getString("Mathe"));
//        }
        
//        Connection().close();
    } 

}
