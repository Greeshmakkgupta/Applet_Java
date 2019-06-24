import java.awt.*;
import java.applet.Applet;
import java.awt.color.*;
public class scrollApplet extends Applet implements Runnable {
    Thread t;
    String msg="Welcome to Github ";
    boolean flag;
    @Override
    public void init(){
        setBackground(Color.WHITE);
        setForeground(Color.BLACK);
    }
    @Override
    public void start()
    {
        t=new Thread(this);
        t.start();
        flag=true;
    }
    @Override
    public void stop()
    {
        flag=false;
        t=null;
    }
    @Override
    public void paint(Graphics g)
    {
        g.setFont(new Font("Times New Roman", Font.PLAIN, 42));
        g.drawString(msg,50,50);
    }
    @Override
    public void run() {
        try {
            while (flag) {
                repaint();
                Thread.sleep(100);
                char ch = msg.charAt(0);
                msg = msg.substring(1) + ch;
            }
        } catch (InterruptedException e) {
        }
    }

}