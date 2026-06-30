package JDBC.case_study2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {
    JButton b1, b2, b3, b4, b5;

    Dashboard()
    {
        setTitle("Dashboard");
        setSize(500,400);
        setLayout(null);
        b1 = new JButton("Complaint Form");
        b1.setBounds(120, 40, 200, 30);

        b2 = new JButton("View Complaint");
        b2.setBounds(120, 90, 200, 30);

        b3 = new JButton("Search Complaint");
        b3.setBounds(120, 140, 200, 30);

        b4 = new JButton("Committee");
        b4.setBounds(120, 190, 200, 30);

        setVisible(true);

    }


    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            new ComplaintForm();
        }
        if(e.getSource() == b2){
            new ViewComplaint();
        }
        if(e.getSource() == b3){
            new SearchComplaint();
        }
        if(e.getSource() == b4){
            new CommitteeForm();
        }
        if(e.getSource() == b5){
            new ReportForm();
        }

    }

}
