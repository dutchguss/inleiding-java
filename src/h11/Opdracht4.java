package h11;

import java.applet.Applet;
import java.awt.Graphics;

public class Opdracht4 extends Applet {

	public void init() {
		setSize(500, 500);
		}

		public void paint(Graphics g){
			int x = 50;
			int y = 30;
			for (int i = 3; i < 33; i+=3 ){
				g.drawString(""+i, x, y);
				x += 20;
				
				
			}
			
			
		}
	}