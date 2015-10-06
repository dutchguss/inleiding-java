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
		int width = 10;
		int height = 10;
		while (i < 6){
			
			g.drawOval(x, y, width, height);
			width += 10;
			x -= 5;
			y -= 5;
			height += 10;
			i++;
		
		
	}
}
}