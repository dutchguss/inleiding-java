package h04;

import java.awt.*;
import java.applet.*;

@SuppressWarnings({ "serial" })
public class Diagram extends Applet {
	public void init() {
	  }

	  public void paint(Graphics g) {
	    setBackground(Color.white);
	    g.setColor(Color.black);
	    g.drawRect(100, 100, 220, 220);
	    g.setColor(Color.pink);
	    g.fillRect(100, 255, 40, 65);
	    g.setColor(Color.blue);
	    g.fillRect(140, 170, 40, 150);
	    g.setColor(Color.yellow);
	    g.fillRect(180, 205, 40, 115);
	    g.setColor(Color.black);
	    g.drawString("valerie 40", 90, 330);
	    g.drawString("jeroen 100", 120, 350);
	    g.drawString("hans 80", 175, 335);
	    g.drawString("0", 90, 318);
	    g.drawString("20", 85, 290);
	    g.drawString("40", 85, 262);
	    g.drawString("60", 85, 236);
	    g.drawString("80", 85, 208);
	    g.drawString("100", 80, 180);
	    g.drawString("120", 80, 152);
	  } 	
}

