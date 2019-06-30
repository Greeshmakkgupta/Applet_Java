import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calci extends Applet implements ActionListener {
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1,b2,b3,b4,b5;
    public void init()
    {
        l1=new Label("first no");
        l2=new Label("second no");
        l3=new Label("result");
        t1=new TextField(10);
        t2=new TextField(10);
        t3=new TextField(10);
        t3.setEnabled(false);
        b1=new Button("+");
        b2=new Button("-");
        b3=new Button("*");
        b4=new Button("/");
        b5=new Button("clear");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
    }
    public  void actionPerformed(ActionEvent e)
    {
        int a,b,c;
        a=Integer.parseInt(t1.getText());
        b=Integer.parseInt(t1.getText());
        if(e.getSource()==b1)
        {
            c=a+b;
            t3.setText(c+"");
        }
        else if(e.getSource()==b2)
        {
            c=a-b;
            t3.setText(String.valueOf(c));
        }
        else if(e.getSource()==b3)
        {
            c=a*b;
            t3.setText(c+"");
        }
        else if(e.getSource()==b4)
        {
            c=a/b;
            t3.setText(c+"");
        }
        else if(e.getSource()==b5)
        {
           t1.setText(null);
            t2.setText(null);
            t3.setText(null);
        }
    }
}
