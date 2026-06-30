package JDBC.case_study2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame implements ActionListener {
    JLabel l1, l2;
    JTextField textUser;
    JPasswordField textPass;
    JButton login, reset;

    LoginFrame(){
        setTitle("POSH Login");
        setSize(400, 300);
        setLayout(null);
        l1 = new JLabel("Username:");
        l1.setBounds(50, 50, 100, 30);

        textUser = new JTextField();
        textUser.setBounds(150, 50, 150, 30);

        l2 = new JLabel("Password:");
        l2.setBounds(50, 100, 100, 30);

        textPass = new JPasswordField();
        textPass.setBounds(150, 100, 150, 30);

        login = new JButton("Login");
        login.setBounds(70, 180, 100, 30);

        reset = new JButton("Reset");
        reset.setBounds(190, 180, 100, 30);

        add(l1);
        add(textUser);
        add(l2);
        add(textPass);
        add(login);
        add(reset);

        login.addActionListener(this);
        reset.addActionListener(this);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    public void actionPerformed(ActionEvent e){
         if(e.getSource() == login){
             if(textUser.getText().equals("admin") && textPass.getText().equals("admin"))
             {
                 new Dashboard();
                 dispose();
             }else {

                 JOptionPane.showMessageDialog(null,"Incorrect Username or Password");

             }

         }
        if(e.getSource()==reset){
            textUser.setText("");
            textPass.setText("");
        }

    }

}