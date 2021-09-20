
package Project;

/**
 *
 * @author faisal
 */
import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.*;

public class RectangleAnimation extends JApplet {

    public static void main(String s[]) {
        JFrame frame = new JFrame();
        frame.setTitle("Rectangle Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JApplet applet = new RectangleAnimation();
        applet.init();
        frame.getContentPane().add(applet);
        frame.pack();
        frame.setVisible(true);
    }

    public void init() {
        JPanel panel = new PanelRectangleAnimation();
        getContentPane().add(panel);
    }
}

class PanelRectangleAnimation extends JPanel implements Runnable {

  //Valuables 
    
    //Length and width for frame
    private static final int FW = 400;
    private static final int FH = 400;
    //Length and width for rectangle
    private static final int RW = 50;
    private static final int RH = 50;

    double x = 0;
    double y = 0;
    double z = 0;
    double s = 0;
    double q = 0;
    
    //rectangle valuables
    private static int a1 = 80;
    private static int b1 = 80;

    private static int a2 = 200;
    private static int b2 = 150;

    private static int a3 = 90;
    private static int b3 = 100;

    private static int a4 = 200;
    private static int b4 = 100;

    private static int a5 = 100;
    private static int b5 = 200;

    private static int A1 = 2;
    private static int B1 = 3;

    private static int A2 = 3;
    private static int B2 = 2;

    private static int A3 = 2;
    private static int B3 = 4;
    
    private static int A4 = 4;
    private static int B4 = 6;

    private static int A5 = 6;
    private static int B5 = 8;
    
    int ballSize = 100;
    Rectangle rec;
    Thread mythread;
    String[] colors = {"red, black"};

    public PanelRectangleAnimation() {
        setPreferredSize(new Dimension(400, 400));
        this.setBackground(Color.black);

        mythread = new Thread(this);
        mythread.start();
    }

    public void run() {
        
     // animation loop
        while (true) {

            a1 += A1;
            b1 += B1;
            a2 += A2;
            b2 += B2;
            a3 += A3;
            b3 += B3;
            a4 += A4;
            b4 += B4;
            a5 += A5;
            b5 += B5;

            //move the rectangle 1
            if (a1 <= 0 || a1 >= 400 - 100) {
                A1 *= -1;
                x++;
            }
            if (b1 <= 0 || b1 >= 400 - 170) {
                B1 *= -1;
                x++;
            }

             //move the rectangle 2
            if (a2 <= 0 || a2 >= 400 - 100) {
                A2 *= -1;
                y++;
            }
            if (b2 <= 0 || b2 >= 400 - 170) {
                B2 *= -1;
                y++;
            }
            
             //move the rectangle 3
            if (a3 <= 0 || a3 >= 400 - 100) {
                A3 *= -1;
                z++;
            }
            if (b3 <= 0 || b3 >= 400 - 170) {
                B3 *= -1;
                z++;
            }
            
             //move the rectangle 4
            if(a4 <= 0 || a4 >= 400 - 100 ){
                A4 *= -1;
                s++;
            }
            if(b4 <= 0 || b4 >= 400 - 170){
                B4 *= -1;
                s++;        
            }
            
             //move the rectangle 5
            if(a5 <= 0 || a5 >= 400 - 100 ){
                A5 *= -1;
                q++;
            }
            if(b5 <= 0 || b5 >= 400 - 170){
                B5 *= -1;
                q++;        
            }
            
            repaint();
            
            //the speed of the rectangle movement
            try {
                Thread.sleep(15);
            } catch (Exception e) {

            }
            try {
                Thread.sleep(15);
            } catch (Exception e) {

            }
        }
    }
    Graphics2D g2;

    @Override
    public void paintComponent(Graphics g) {
        
        //draw the rectangle
        super.paintComponent(g);
        g2 = (Graphics2D) g;

        if (x % 2 == 1) {
            g2.setColor(Color.red);
        } else {
            g2.setColor(Color.green);
        }

        // draw the rec 1
        rec = new Rectangle(a1,b1, RW,RH);
        g2.fill(rec);

        
        if (z % 2 == 1) {
            g2.setColor(Color.red);
        } else {
            g2.setColor(Color.green);
        }
        // draw the rec 2
       rec = new Rectangle(a2,b2,RW,RH); 
       g2.fill(rec);

       // draw the rec 3
       rec = new Rectangle(a3, b3, RW,RH);
        g2.fill(rec);
        
        // draw the rec 4
       rec = new Rectangle(a4,b4,RW,RH);
        g2.fill(rec); 
        
        // draw the rec 5
        rec = new Rectangle(a5,b5,RW,RH);
        g2.fill(rec); 
        
    }
    
    //change the color green to red
private void repaint(Color BLACK) {
        throw new UnsupportedOperationException("Notyet.");
    }

    private void setBackgroundColor(Color blue) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
   
