import java.applet.Applet;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Capital_of_states_by_choice extends Applet implements ItemListener{

    Choice ch;
    TextField t;
    Label l;

    public void init() {
        ch = new Choice();
        ch.add("MADHYA PRADESH");
        ch.add("UTTAR PRADESH");
        ch.add("KARNATAKA");
        ch.add("RAJASTHAN");
        l = new Label("capital");
        t = new TextField(30);
        add(ch);
        add(l);
        add(t);
        ch.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        String capital = null;
        String crs = ch.getSelectedItem();
        if(crs.equals("MADHYA PRADESH"))

           capital="BHOPAL";
        else if(crs.equals("UTTAR PRADESH"))


            capital="LUCKNOW";
        else if(crs.equals("RAJASTHAN"))

            capital="JAIPUR";

        else if(crs.equals("KARNATAKA"))

            capital="BANGLORE";

        t.setText(capital);
    }

}


