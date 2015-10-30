package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Btw extends Applet {
    TextField tekstvak;
    Label label;				
    double getal;
    double Btw;
    Button ok;
	
    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type een getal");
        tekstvak.addActionListener( new TekstvakListener() );
        add(label);
        add(tekstvak);
        ok = new Button();
        ok.setLabel("ok");
        Btw = 1.21;
    }

    public void paint(Graphics g) {
        g.drawString("Het getal is " + getal*Btw, 50, 60 );
        
    }
	
    	class TekstvakListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble( s );
            repaint();
        }
    }

}
