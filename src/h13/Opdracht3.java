package h13;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Opdracht3 extends Applet{
	public void paint(Graphics g){
		redBricks(g);
	}

	void redBricks(Graphics g) {
		
		g.setColor(Color.red);
		for (int iRow = 0; 2+22*iRow < getHeight(); iRow++) {
			for (int iCol = 0; 2+52*(iCol-1) < getWidth(); iCol++) {
				if (iRow % 2 == 0) {g.fillRect(2+52*iCol, 2+22*iRow, 50, 20);}
				else {g.fillRect(-25+52*iCol, 2+22*iRow, 50, 20);}
			}
		}
	}
	
}
	
	
	
	

