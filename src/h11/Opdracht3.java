package h11;

import java.applet.Applet;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class Opdracht3 extends Applet {
		 
		
		public void init() {
		setSize(500, 500);
		}

		public void paint(Graphics g){
			int x = 50;
			int y = 30;
			int o = 1;
			for (int i = 1; i < 30; i+=o ){
				g.drawString(""+i, x, y);
				x += 20;
				o ++;
				
				
			}
			
			
		}
	}


