package JDBC.case_study2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class ComplaintForm extends JFrame implements ActionListener {
   JTextField t1, t2, t3, t4;
   JTextArea area;
   JComboBox<String> status;
   JButton save;
   ComplaintForm(){
       setTitle("Complaint Form");
       setSize(500, 500);
       setLayout(null);
       JLabel l1 = new JLabel("ID");
       l1.setBounds(50, 50, 100, 30);

       JLabel l2 = new JLabel("Name");
       l2.setBounds(50, 100, 100, 30);

       JLabel l3 = new JLabel("Gender");
       l3.setBounds(50, 150, 100, 30);

       JLabel l4 = new JLabel("Batch");
       l3.setBounds(50, 200, 100, 30);

       JLabel l5 = new JLabel("Complaint_des");
       l3.setBounds(50, 250, 100, 30);

       JLabel l6 = new JLabel("Status");
       l3.setBounds(50, 350, 100, 30);


       t1 = new JTextField();
       t1.setBounds(180, 50, 150, 30);

       t2 = new JTextField();
       t2.setBounds(180, 100, 150, 30);

       t3 = new JTextField();
       t3.setBounds(180, 150, 150, 30);

       t4 = new JTextField();
       t4.setBounds(180, 200, 150, 30);

       area = new JTextArea();

       JScrollPane sp = new JScrollPane(area);
       sp.setBounds(180, 250, 200, 70);

       status = new JComboBox<>();
       status.addItem("Pending");
       status.addItem("Resolved");
       status.setBounds(180, 350, 150, 30);

       save = new JButton("Save");
       save.setBounds(180, 400, 100, 30);

       add(l1); add(t1);
       add(l2); add(t2);
       add(l3); add(t3);
       add(l4); add(t4);
       add(l5); add(sp);
       add(l6); add(status);
       add(save);
       save.addActionListener(this);
       setVisible(true);

   }

    public void actionPerformed(ActionEvent e) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "insert into learner values(?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(t1.getText()));
            ps.setString(2, t2.getText());
            ps.setString(3, t3.getText());
            ps.setString(4, t4.getText());
            ps.setString(5, area.getText());
            ps.setString(6, status.getSelectedItem().toString());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(this, "Complaint Saved");

        }
        catch (Exception e1) {
            JOptionPane.showMessageDialog(this,e1);
        }

    }
}