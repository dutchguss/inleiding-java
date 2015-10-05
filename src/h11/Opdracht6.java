package h11;

import java.applet.Applet;
import java.awt.Graphics;

public class Opdracht6 extends Applet {

	
	public void init(){
		
	}
	
	public void paint (Graphics g){
		int i = 0;
		int x = 50;
		int y = 50;
		while (i < 6){
			
			g.drawRect(x, y, 30, 30);
			y += 30;
			x += 30;
			i++;
		
		
	}
}
}
