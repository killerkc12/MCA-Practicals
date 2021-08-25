import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class A6Q1 extends JFrame implements ActionListener {
    JButton red,green,blue;
    JPanel panel;
    public A6Q1(){
        panel = new JPanel();
        setTitle("A6Q1");
        red = new JButton("Red");
        green = new JButton("Green");
        blue = new JButton("Blue");
        panel.add(red);
        panel.add(green);
        panel.add(blue);
        panel.setVisible(true);
        add(panel);
        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400,200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Object obj1 = e.getSource();
        if (obj1 == red)
            panel.setBackground(Color.RED);
        if (obj1 == green)
            panel.setBackground(Color.green);
        if (obj1 == blue)
            panel.setBackground(Color.blue);
    }

    public static void main(String[] args) {
        A6Q1 obj = new A6Q1();
    }
}

