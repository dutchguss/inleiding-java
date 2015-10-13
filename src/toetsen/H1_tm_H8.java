package toetsen;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H1_tm_H8 extends Applet{
	Button plus, min, ok;
	TextField geld;
	Double getalgeld;
	int fooi2;
	Double Bedrag, help;
	Label fooi;
	
	public void init(){
		setSize(500, 500);
		fooi2 = 15;
		getalgeld = 0.0;
		plus = new Button("+");
		min = new Button("-");
		ok = new Button("ok");
		geld = new TextField("voer een bedrag in");
		KnopListenerok kl = new KnopListenerok();
        ok.addActionListener( kl );
        KnopListenerplus kl2 = new KnopListenerplus();
        plus.addActionListener( kl2 );
        KnopListenermin klmin = new KnopListenermin();
        min.addActionListener( klmin );
		add(geld);
		add(ok);
		add(plus);
		add(min);
		fooi = new Label("fooi:");
		add(fooi);
		

	}

		

	public void paint (Graphics g){
		Bedrag = (getalgeld / 100 * fooi2 + getalgeld);
		help = (getalgeld / 100 * fooi2);
		g.drawString("uw fooi ="+(String.format("%.2f", Double.valueOf(help))), 10, 60);
		g.drawString("het totaal inclusief fooi("+fooi2+"%):"+(String.format("%.2f", Double.valueOf(Bedrag))), 10, 70);
		plus.setLocation(323, 30);
		min.setLocation(300, 30);
		fooi.setLocation(250, 30);
	}
	
	class KnopListenerok implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
        getalgeld= Double.parseDouble(geld.getText());
        repaint();
	
}
	}
	class KnopListenerplus implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
        fooi2++;
        repaint();
}
	}
	class KnopListenermin implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
        fooi2--;
        repaint();
}
	}
}







