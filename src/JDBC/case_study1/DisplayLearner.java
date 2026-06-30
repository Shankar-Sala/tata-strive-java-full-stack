package JDBC.case_study1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayLearner {
    public void showData() {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "select * from learner";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + " "
                                + rs.getString(2) + " "
                                + rs.getString(3) + " "
                                + rs.getString(4) + " "
                                + rs.getString(5));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
