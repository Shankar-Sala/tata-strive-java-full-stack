package JDBC.case_study2;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static Connection con;
    public static Connection getConnection() {
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jfsjd_00051", "root", "8mbG#98RsTyP");
       } catch (Exception e1) {
           System.out.println(e1.getMessage());
       }
       return con;
    }
}
