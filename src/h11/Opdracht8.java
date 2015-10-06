
package h11;

import java.applet.Applet;
import java.awt.Graphics;

public class Opdracht8 extends Applet {

	
	public void init(){
		
	}
	
	public void paint (Graphics g){
		int i = 0;
		int x = 50;
		int y = 50;
		int width = 10;
		int height = 10;
		while (i < 101){
			
			g.drawOval(x, y, width, height);
			x += 0;
			y += 0;
			width += 10;
			height += 10;
i++;
		
		
	}
}
}