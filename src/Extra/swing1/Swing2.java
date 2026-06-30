package Extra.swing1;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
  // Top section of the image describes the Swing hierarchy:
// Object -> Component -> Container -> JComponent -> AbstractButton -> JButton

// ActionListener is an interface used to handle button click events.


   ANONYMOUS INNER CLASS APPROACH
   This is how you typically write an event listener inline.

new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        // 1. Get text from input fields (txtnum1, txtnum2) and convert to integers
        int n1 = Integer.parseInt(txtnum1.getText());
        int n2 = Integer.parseInt(txtnum2.getText());

        // 2. Perform the addition
        int result = n1 + n2;

        // 3. Display the result in the label/text field (res)
        res.setText("Result : " + result);
    }
};

---------------------------------------------------------------------------

   COMPILER INTERNAL REPRESENTATION
   The compiler effectively transforms the anonymous class above
   into a concrete class like the one below.

class MyListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        // Extract values from text fields
        int n1 = Integer.parseInt(txtnum1.getText());
        int n2 = Integer.parseInt(txtnum2.getText());

        // Calculate sum
        int result = n1 + n2;

        // Update the UI with the result
        res.setText("Result : " + result);
    }
}

 */

public class Swing2 {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Simple Calculator");

        JLabel num1 = new JLabel("First Number");
        num1.setBounds(30, 30, 100, 30);

        JTextField txtnum1 = new JTextField();
        txtnum1.setBounds(150, 30, 100, 30);

        JLabel num2 = new JLabel("Second Number");
        num2.setBounds(30, 80, 100, 30);

        JTextField txtnum2 = new JTextField();
        txtnum2.setBounds(150, 80, 100, 30);

        JButton btn1 = new JButton("Add");
        btn1.setBounds(30, 160, 80, 30);

        JButton btn2 = new JButton("Sub");
        btn2.setBounds(120, 160, 80, 30);

        JButton btn3 = new JButton("Mul");
        btn3.setBounds(210, 160, 80, 30);

        JButton btn4 = new JButton("Div");
        btn4.setBounds(300, 160, 80, 30);

        JLabel res = new JLabel("Result : ");
        res.setBounds(30, 200, 250, 30);

        // Add Button event
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                int n1=Integer.parseInt(txtnum1.getText());
                int n2=Integer.parseInt(txtnum2.getText());
                int result=n1+n2;
                res.setText("Result "+result);
            }
        });

        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                int n1=Integer.parseInt(txtnum1.getText());
                int n2=Integer.parseInt(txtnum2.getText());
                int result=n1-n2;
                res.setText("Result "+result);
            }
        });

        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                int n1=Integer.parseInt(txtnum1.getText());
                int n2=Integer.parseInt(txtnum2.getText());
                int result=n1*n2;
                res.setText("Result "+result);
            }
        });

        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                int n1=Integer.parseInt(txtnum1.getText());
                int n2=Integer.parseInt(txtnum2.getText());
                int result=n1/n2;
                res.setText("Result "+result);
            }
        });



        frame.add(num1);
        frame.add(txtnum1);
        frame.add(txtnum2);
        frame.add(num2);
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(res);


        frame.setSize(450, 350);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}