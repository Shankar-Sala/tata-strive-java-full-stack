package JDBC.case_study1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection getConnection()
    {
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jfsjd_00051", "root", "8mbG#98RsTyP");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return con;
    }
}
