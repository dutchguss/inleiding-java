package h02;
import java.awt.*;
import java.applet.*;

@SuppressWarnings("serial")
public class Naam extends Applet{

	public void init() {
		setBackground(Color.blue);
	}
	public void paint(Graphics g) {
	    g.setColor(Color.yellow);
	    g.drawString("mitchel", 50, 60 );
	   

	    }
	}