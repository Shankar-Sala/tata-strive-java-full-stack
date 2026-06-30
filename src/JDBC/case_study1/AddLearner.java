package JDBC.case_study1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class AddLearner {
    public void addLearner() {
        try{
            Connection con = DBConnection.getConnection();
            String sql = "insert into learner values(?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, 104);
            ps.setString(2, "Riya");
            ps.setString(3, "Cyber Security");
            ps.setString(4,"Mumbai");
            ps.setString(5, "Pending");
            int i = ps.executeUpdate();
            if(i>0){
                System.out.println("Record Inserted");

                ps.close();
                con.close();
            }
        }catch(Exception e){
            System.out.println(e.getMessage());

        }
    }
}
