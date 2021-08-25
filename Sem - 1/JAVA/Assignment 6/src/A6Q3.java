import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class A6Q3 extends JFrame{
    JPanel panel;
    static int n =1;
    public A6Q3(){
        panel = new JPanel();
        add(panel);
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        addMouseListener(new MouseAdapter(){
           public void mouseClicked(MouseEvent me){
               Graphics g = getGraphics();
               if(n==1){
                   g.setColor(Color.red);
                   g.drawOval(me.getX(),me.getY(),50,50);
               }
               if(n==2){
                   g.setColor(Color.blue);
                   g.drawRect(me.getX(),me.getY(),70,50);
               }
               if(n==3){
                   g.setColor(Color.green);
                   g.drawArc(me.getX(),me.getY(),100,40,0,360);
               }
               n++;
               if (n>3)
                   n=1;
           }
        });
    }

    public static void main(String[] args) {
        A6Q3 obj = new A6Q3();
    }

}
