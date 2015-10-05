package h11;

import java.applet.Applet;


import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht5 extends Applet{
TextField tafels;
int i, keer, tafel,tafel1;
	public void init(){
		tafels = new TextField();
		tafels.addActionListener( new Tekstvaklistener() );
		add(tafels);
	}
	public void paint(Graphics g){
		int x = 10;
		int y = 10;
		tafel = 1;
for(int i = tafel1; i < 100; i+=9 ){
	

			keer = (tafel1 *tafel);
			g.drawString(""+keer, x, y);
tafel+= 1;
	i++;		
			x += 20;
			
}			
	}

class Tekstvaklistener implements ActionListener{
	public void actionPerformed  (ActionEvent e){
        tafel1 = Integer.parseInt( tafels.getText() );
        repaint();
    }
}

}
		

