package JDBC.case_study1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdatePlacement {
    public void updateStatus(){
        try{
            Connection con = DBConnection.getConnection();
            String sql = "update learner set placement=? where id=?";
            PreparedStatement ps = con.prepareCall(sql);
            ps.setString(1,"Placed");
            ps.setInt(2,103);
            int i=ps.executeUpdate();
            if(i>0){
                System.out.println("Updated Successfully");
            }

            ps.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
