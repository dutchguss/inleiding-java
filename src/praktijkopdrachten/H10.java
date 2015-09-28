package praktijkopdrachten;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


@SuppressWarnings("serial")
public class H10 extends Applet {		

    int leeftijd;
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
            leeftijd = Integer.parseInt( s );
            if ( leeftijd < 3.1 ) {
                tekst = "dit is slecht.";
                repaint();
            }
            if (leeftijd > 3.9){
                tekst = "dit is onvoldoende";
            
            repaint();
        }
    if (leeftijd > 4.9){
    tekst = "dit is matig";

repaint();}

if (leeftijd >5.9){
	tekst = "dit is voldoende";
	repaint();
}
if (leeftijd > 7.9);
tekst = "dit is goed";

repaint();}
    else {
    	tekst = "u heeft geen geldig nummer ingevoerd";
    }
    repaint();
 
    class knopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
        	tekst = ("");
        	tekst = tekstvak.getText();
        }
}
}
}
