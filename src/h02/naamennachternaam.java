package h02;
import java.awt.*;
import java.applet.*;

@SuppressWarnings("serial")
public class naamennachternaam extends Applet{

	public void init() {
		setBackground(Color.yellow);
	}
	public void paint(Graphics g) {
	    g.setColor(Color.blue);
	    g.drawString("mitchel", 50, 60 );
	    g.setColor(Color.red);
	    g.drawString("van vliet", 60, 70);
	   

	    }
	}