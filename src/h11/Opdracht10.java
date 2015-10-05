package h11;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Opdracht10 extends Applet {

	public void init() {
		setSize(500, 500);
	}
		

	public void paint(Graphics g){
		int x = 50;
		int y = 50;
		int width = 20;
		int height = 20;
		for (int j = 0; j<8; j++){
		for (int i = 0; i < 8; i++ ){
			
			if ((j+i) %2 == 0){
				g.drawRect(x, y, width, height);
		}
			else {
				g.setColor(Color.black);
				g.fillRect(x, y, width, height);
			}
			x+= 20;
			
		}
		x = 50;
				y +=20;
		}

	}
}

