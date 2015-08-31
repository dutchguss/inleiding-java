package h06;
import java.awt.*;
import java.applet.*;


@SuppressWarnings("serial")
public class opdracht63 extends Applet {
    int a, b, c, d, e, uitkomst;
	
	
    public void init() {
        a = 2000000000;
        b = 200000000;
        c = 2;
        uitkomst = ( a * b * c);
    }

    public void paint(Graphics g) {
      
		g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}
