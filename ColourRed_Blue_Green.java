import java.applet.Applet;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;


public  class ColourRed_Blue_Green extends Applet implements AdjustmentListener{
    Label l1, l2,l3;
    Scrollbar s1,s2,s3;
    public void init()
    {
        l1=new Label("red");
        l2=new Label("green");
        l3=new Label("Blue");
        s1=new Scrollbar(Scrollbar.HORIZONTAL,10,1,0,255);
        s2=new Scrollbar(Scrollbar.HORIZONTAL,10,1,0,255);
        s3=new Scrollbar(Scrollbar.HORIZONTAL,10,1,0,255);
        add(l1);
        add(s1);
        add(l2);
        add(s2);
        add(l3);
        add(s3);
        s1.addAdjustmentListener(this);
        s2.addAdjustmentListener(this);
        s3.addAdjustmentListener(this);
    }

    public void adjustmentValueChanged(AdjustmentEvent e)
    {
        int r,g,b;
        r=s1.getValue();
        g=s2.getValue();
        b=s3.getValue();
        Color c=new Color(r,g,b);
        setBackground(c);

    }

}