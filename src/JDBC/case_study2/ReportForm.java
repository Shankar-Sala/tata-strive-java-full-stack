package JDBC.case_study2;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReportForm extends JFrame {
    JTextArea area;
    ReportForm(){
        setTitle("Reports");
        setSize(500,400);
        area=new JTextArea();
        add(new JScrollPane(area));
        try {
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from complaint where id=?");

            while(rs.next()) {

                area.append(
                        rs.getInt(1)
                                + " "
                                + rs.getString(2)
                                + " "
                                + rs.getString(6)
                                + "\n");
            }

        }
        catch (Exception e) {
            System.out.println(e);
        }
        setVisible(true);
    }
}
