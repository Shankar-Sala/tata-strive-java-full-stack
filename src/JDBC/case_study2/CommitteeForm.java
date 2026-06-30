package JDBC.case_study2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CommitteeForm extends JFrame implements ActionListener {
   JTextField t1, t2, t3, t4;
   JButton save;

   CommitteeForm(){
       setTitle("Committee Members");
       setSize(400,350);
       setLayout(null);
       JLabel l1 = new JLabel("Member ID");
       l1.setBounds(50,50,100,30);

       JLabel l2 = new JLabel("Member Name");
       l2.setBounds(50,100,100,30);

       JLabel l3 = new JLabel("Member Designation");
       l3.setBounds(50,130,100,30);

       JLabel l4 = new JLabel("Member Phone");
       l4.setBounds(50,170,100,30);

       t1 = new JTextField();
       t1.setBounds(180,50,150,30);

       t2 = new JTextField();
       t2.setBounds(180,90,150,30);

       t3 = new JTextField();
       t3.setBounds(180,130,150,30);

       t4 = new JTextField();
       t4.setBounds(180, 170, 150, 30);

       save = new JButton("Save");
       save.setBounds(140, 230, 100, 30);
       add(l1);
       add(t1);
       add(l2);
       add(t2);
       add(l3);
       add(t3);
       add(l4);
       add(t4);
       add(save);

       save.addActionListener(this);
       setVisible(true);
   }

   public void actionPerformed(ActionEvent e){
       JOptionPane.showMessageDialog(this, "Committee Saved");

   }
}
