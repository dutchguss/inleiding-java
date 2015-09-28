package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


@SuppressWarnings("serial")
public class Opdracht1 extends Applet {		
int getal2;
int getal1;
    int leeftijd;
    TextField tekstvak;
    Label label;
    String tekst;
	
    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener( new VakListener() );
        tekst = "";
		
        label = new Label("Geef uw leeftijd in en druk op enter" );
		
        add( label );
        add( tekstvak );	
    }

    public void paint(Graphics g) {
        g.drawString("het hoogste getal ="+getal1, 50, 45 );
    }
	
    class VakListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String s;
            s = tekstvak.getText();
            if ( getal1 > getal2 ) {
            }
            else {
                
            }
            repaint();
            }		
        }
    }

