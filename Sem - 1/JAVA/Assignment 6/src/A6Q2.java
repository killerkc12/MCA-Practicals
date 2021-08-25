import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class A6Q2 extends JFrame implements ActionListener {

    JLabel l1 ,l2;
    JTextField t1,t2;
    JButton b;
    JPanel panel;

    public A6Q2(){
        l1 = new JLabel("Enter the UserName : ");
        t1 = new JTextField(20);
        l2 = new JLabel("Enter the Password : ");
        t2 = new JTextField(20);
        b = new JButton("Submit");

        panel = new JPanel(new GridLayout(3,2));
        panel.add(l1);
        panel.add(t1);
        panel.add(l2);
        panel.add(t2);
        panel.add(b);

        add(panel,BorderLayout.CENTER);
        b.addActionListener(this);
        setTitle("A6Q2");
        setSize(400,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        String username = t1.getText();
        String password = t2.getText();
        if(username.equals("kiran") && password.equals("chavan")){
            SuccessPage page = new SuccessPage();
            page.setVisible(true);
            JLabel label = new JLabel("Username and Password is Correct");
            page.getContentPane().add(label);
        }else {
            JOptionPane.showMessageDialog(this,"Username or Password Invalid!","Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        A6Q2 obj = new A6Q2();
    }
}
