package h04;

import java.awt.*;
import java.applet.*;

@SuppressWarnings({ "serial" })
public class Stoplicht extends Applet {
	public void init() {
	  }

	  public void paint(Graphics g) {
	    setBackground(Color.white);
	    g.setColor(Color.black);
	    g.fillRoundRect(52, 100, 95, 210, 20, 20);
	    g.setColor(Color.red);
	    g.fillOval(75, 120, 50, 50);
	    g.setColor(Color.orange);
	    g.fillOval(75, 180, 50, 50);
	    g.setColor(Color.green);
	    g.fillOval(75, 240, 50, 50);
	  } 	
}

