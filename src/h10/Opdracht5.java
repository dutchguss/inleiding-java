package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


@SuppressWarnings("serial")
public class Opdracht5 extends Applet {		

    int cijfer;
    TextField tekstvak;
    Label label;
    String tekst;
    Button ok;
	
    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener( new VakListener() );
        tekst = "";
		
        label = new Label("Geef uw leeftijd in en druk op enter" );
		
        add( label );
        add( tekstvak );
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 45 );
    }
	
    class VakListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String s;
			
            s = tekstvak.getText();
            cijfer = Integer.parseInt( s );
            if ( cijfer > 5.4 ) {
                tekst = "dit is voldoende.";
                repaint();
            }
            else {
                tekst = "dit is onvoldoende";
            }
            repaint();
        }
    }
    class knopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
        	tekst = ("");
        	tekst = tekstvak.getText();
        }
}
}
