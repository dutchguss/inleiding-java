package praktijkopdrachten;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class H11_1 extends Applet{
TextField tafels;
int i, keer, tafel,tafel1;
Button ok;

	public void init(){
		tafels = new TextField();
		tafels.addActionListener( new Tekstvaklistener() );
		add(tafels);
		ok = new Button("ok");
		ok.addActionListener(new Tekstvaklistener());
		add(ok);
	}
	public void paint(Graphics g){
		int x = 10;
		int y = 10;
		tafel = 1;
	

			keer = (tafel1 *tafel);
			g.drawString("1x"+keer+"="+ keer*1, x, y);
			g.drawString("2x"+keer+"="+ keer*2, x, y+10);
			g.drawString("3x"+keer+"="+ keer*3, x, y+20);
			g.drawString("4x"+keer+"="+ keer*4, x, y+30);
			g.drawString("5x"+keer+"="+ keer*5, x, y+40);
			g.drawString("6x"+keer+"="+ keer*6, x, y+50);
			g.drawString("7x"+keer+"="+ keer*7, x, y+60);
			g.drawString("8x"+keer+"="+ keer*8, x, y+70);
			g.drawString("9x"+keer+"="+ keer*9, x, y+80);
			g.drawString("10x"+keer+"="+ keer*10, x, y+90);
			
tafel+= 1;
	i++;
			
}			
	

class Tekstvaklistener implements ActionListener{
	public void actionPerformed  (ActionEvent e){
        tafel1 = Integer.parseInt( tafels.getText() );
        tafels.setText("");
        repaint();
    }
}
}

		

