package Extra.swing1;

import javax.swing.JLabel;
import javax.swing.*;

/*
 *Swing ----it is a framework in Java
 *
 * Swing is a Java GUI(Graphical User Interface) framework used to
 * create desktop applications with windows,buttons,text fields,
 * labels, menus, tables, etc.
 *
 *
 * Applet---->AWT------>Swing(Light weight)
 * -----Rich GUI components
 * -----Platforms Independent
 * -----Event Handling Support
 * -----Part of Java Foundation Classes(JFC)
 * -----JFrame----display text
 * JButton----Clickable Button
 * JPasswordField---Password Input
 * JTextArea----Multiple Lines Input
 * JCheckBox----Multiple Selection
 * JRadioButton---Single Selection
 * JComboBox----JComboBox
 * JPanel-----Container
 */
public class Swing1 {
    public static void main(String args[])
    {
        //create Frame
        JFrame f1=new JFrame("Student Login Form");
        //Create Label
        JLabel l1=new JLabel("Username :");
        l1.setBounds(50,50,100,30);
        //Create Text Field
        JTextField txtUser= new JTextField();
        txtUser.setBounds(150,50,150,30);
        //Create Label
        JLabel lblPass= new JLabel("Password:");
        lblPass.setBounds(50,100,100,30);
        //Create Password Field
        JPasswordField txtPass=new JPasswordField();
        txtPass.setBounds(150,100,150,30);
        //Create Button
        JButton btnLogin = new JButton("Login");
        btnLogin.setBounds(120,160,100,30);

        //Add components to Frame
        f1.add(l1);
        f1.add(txtUser);
        f1.add(lblPass);
        f1.add(txtPass);
        f1.add(btnLogin);

        //Frame Properties
        f1.setSize(450,500);
        f1.setLayout(null);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}