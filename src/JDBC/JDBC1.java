package JDBC;

// Java application+SQL Database-----------------------JDBC API---------
// JDBC ---- Java Database Connectivity
// MySql ------ oracle ------- SQl SERVER --- PostgreSql


/*
* Java Application ---- JDBc API ----- JDBC Driver ------- Database
*
* ---- import the package
* -----load the driver
* ------Create the connection
* ---------Create statement
* ---------Execute Query
* ---------Process the result
* ----------close the connection
*
*
* */
import java.sql.*;
import java.sql.DriverManager;


public class JDBC1 {
    static void main(String[] args) {
        try{
            //local driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //create the connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jfsjd_00051", "root", "8mbG#98RsTyP");
            // Create Statement
            Statement stmt = con.createStatement();

            //Execute Query
            ResultSet rs = stmt.executeQuery("select * from student");

            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
            }

            //close the connection
            rs.close();
            stmt.close();
            con.close();


        }catch (Exception ee1){
            System.out.println(ee1);
        }

    }
}
