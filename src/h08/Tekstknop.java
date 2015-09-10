package h08;
import java.applet.Applet;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Tekstknop extends Applet {
TextField textvak;
  Button knop1;	
  Button knop2;
  Label label;
  String tekst;
	
    public void init() {
    	this.setSize(new Dimension(500,500));
    	label = new Label ();
    	add(label);
    	textvak = new TextField("", 20);
        add(textvak);
    	knop1 = new Button();
    	KnopListener1 kl1 = new KnopListener1();
    	knop1.addActionListener(kl1);
        knop1.setLabel( "ok" );
        add(knop1);
        knop2 = new Button();
        KnopListener2 kl2 = new KnopListener2();
        knop2.addActionListener(kl2);
        knop2.setLabel( "reset" );
        add(knop2);
        tekst = new String("");
        


    }

    public void paint(Graphics g) {
     g.drawString(tekst, 100, 100);
    }
    class KnopListener1 implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
        	tekst = textvak.getText();
            repaint();
        }
    }
    class KnopListener2 implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
        	tekst = ("");
        	textvak.setText("");
            repaint();
        }
}
}

