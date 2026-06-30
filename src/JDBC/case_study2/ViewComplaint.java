package JDBC.case_study2;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ViewComplaint extends JFrame {
    JTable table;
    DefaultTableModel model;

    ViewComplaint(){
        setTitle("Complaint Report");
        setSize(700, 400);
        model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Gender");
        model.addColumn("Batch");
        model.addColumn("complaint_des");
        model.addColumn("Status");
        table = new JTable(model);
        try{
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from complaint");
            while(rs.next()){
                model.addRow(new Object[]{ rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getString(4),  rs.getString(5), rs.getString(6) });
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        JScrollPane sp = new JScrollPane(table);
        add(sp);
        setVisible(true);
    }

}
