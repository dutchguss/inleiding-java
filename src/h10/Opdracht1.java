package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


@SuppressWarnings("serial")
public class Opdracht1 extends Applet {		
long getal2;
long getal1;
    TextField tekstvak;
    Label label;
    String tekst;
    long cijfer3;
	
    public void init() {
    	setSize(300,300);
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener( new VakListener() );
        tekst = "";
		
        label = new Label("Geef uw leeftijd in en druk op enter" );
		
        add( label );
        add( tekstvak );	
    }

    public void paint(Graphics g) {
        g.drawString("het hoogste getal ="+getal1, 50, 45 );
        g.drawString("het laagste getal ="+cijfer3, 50, 60);
    }
	
    class VakListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
        	getal2= Long.parseLong(tekstvak.getText());
        	repaint();
        	if (cijfer3 == 0)
        	{
        		cijfer3 = getal2;
        	}
        	if (getal2 > getal1){
        		getal1 = getal2;
        		tekstvak.setText(null);

        	}
        	if (getal2<cijfer3)
        	{
        		cijfer3 = getal2;
        	}
        	tekstvak.setText(null);
    		repaint();
        }
    }
    }




