package h06;
import java.awt.*;
import java.applet.*;


@SuppressWarnings("serial")
public class opdracht62 extends Applet {
    double a, b, c, d, e, uitkomst, uitkomst2, uitkomst3;
	
	
    public void init() {
        a = 60;
        b = 3600;
        c = 60;
        d = 24;
        e = 365;
        uitkomst = ( a * c);
        uitkomst2 = (b * d );
        uitkomst3 = (b * d * e);
    }

    public void paint(Graphics g) {
      
		g.drawString("De uitkomst is: " + uitkomst, 20, 20);
		g.drawString("de uitkomst is:" + uitkomst2, 20, 30);
		g.drawString("de uitkomst is:" + uitkomst3, 20, 40);
    }
}
