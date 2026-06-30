package JDBC.case_study2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SearchComplaint extends JFrame  implements ActionListener{
  JTextField txtId;
  JTextArea area;
  JButton search;

  SearchComplaint(){
      setTitle("Search Complaint");
      setSize(400, 400);
      setLayout(null);

      JLabel l = new JLabel("Complaint ID");
      l.setBounds(50, 30, 100, 30);

      txtId = new JTextField();
      txtId.setBounds(180, 30, 100, 30);

      search = new JButton("Search");
      search.setBounds(120, 80, 100, 30);

      area = new JTextArea();
      area.setBounds(50, 130, 250, 80);

      add(l);
      add(txtId);
      add(search);
      add(area);
      search.addActionListener(this);
      setVisible(true);

  }

    public void actionPerformed(ActionEvent e){
        try {
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement("select * from complaint where id=?");
            ps.setInt(1, Integer.parseInt(txtId.getText()));

            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                area.setText(rs.getString(2) + "\n" + rs.getString(5));
            }

        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

}