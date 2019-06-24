import java.applet.Applet;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class To_know_fees_of_courses_by_Choice extends Applet implements ItemListener {
    Choice ch;
    TextField t;
    Label l;

    public void init() {
        ch = new Choice();
        ch.add("BCA");
        ch.add("BBA");
        ch.add("MCA");
        ch.add("MBA");
        l = new Label("fees");
        t = new TextField(30);
        add(ch);
        add(l);
        add(t);
        ch.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        int fees = 0;
        String crs = ch.getSelectedItem();
        if(crs.equals("BCA"))

            fees = 15000;
        else if(crs.equals("BBA"))


            fees = 12000;
        else if(crs.equals("MCA"))

            fees = 50000;

         else if(crs.equals("MBA"))

            fees = 40000;

        t.setText(fees + " ");
    }

}
