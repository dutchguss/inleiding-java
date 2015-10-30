package h13;

import java.applet.Applet;
import java.awt.Graphics;

public class Opdracht2 extends Applet {
public void paint(Graphics g){
	tekenDriehoek(g, 30, 30, 50, 50, 70, 70);
}
	void tekenDriehoek( Graphics g, int x1, int y1, int x2, int y2, int x3, int y3){
		g.drawPolygon([], [], 3);
	}	
}
