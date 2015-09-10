package h08;
import java.applet.Applet;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Ouderavond extends Applet {
  Button Mannen;	
  Button Vrouwen;
  Label label;
  String tekst;
  int mannen;
  int vrouwen;
  int volwassenmannen;
  int volwassenvrouwen;
  Button moeders;
  Button vaders;
  Button minmannen;
  Button minvrouwen;
  
  
	
    public void init() {
    	setSize(500, 500);
    	label = new Label ();
    	add(label);
    	Mannen = new Button();
    	KnopListener1 kl1 = new KnopListener1();
    	Mannen.addActionListener(kl1);
        Mannen.setLabel( "+1 mannelijke leerling" );
        add(Mannen);
        vaders = new Button();
        vaders.addActionListener(kl1);
        add(vaders);
        vaders.setLabel("+1 vaders");
        Vrouwen = new Button();
        KnopListener2 kl2 = new KnopListener2();
        Vrouwen.addActionListener(kl2);
        Vrouwen.setLabel( "+1 vrouwelijke leerlingen" );
        add(Vrouwen);
        moeders = new Button();
        moeders.addActionListener(kl2);
        add(moeders);
        moeders.setLabel("+1 moeders");
        minmannen = new Button();
        KnopListener3 kl3 = new KnopListener3();
        minmannen.addActionListener(kl3);
        add(minmannen);
        minmannen.setLabel("-1 man");
        minvrouwen = new Button();
        KnopListener4 kl4 = new KnopListener4();
        minvrouwen.addActionListener(kl4);
        add(minvrouwen);
        minvrouwen.setLabel("-1 vrouw");
        tekst = new String("");
        mannen = 0;
        vrouwen = 0;
        volwassenmannen = 0;
        volwassenmannen = 0;
        
       
        
        


    }

    public void paint(Graphics g) {
     g.drawString("aantal mannen"+ mannen+"" , 100, 100);
     g.drawString("aantal vrouwen" + vrouwen+"", 100, 110);
    }
    class KnopListener1 implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
        	mannen++;
            repaint();
            
         
            
            
            
        }
    }
    class KnopListener2 implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
        	vrouwen++;
            repaint();
        }
}
    class KnopListener3 implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
        	mannen--;
            repaint();
}
    }
    class KnopListener4 implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
        	vrouwen--;
            repaint();
}
    }
}
