package h06;
import java.awt.*;
import java.applet.*;


@SuppressWarnings("serial")
public class opdracht6_1 extends Applet {
    double a, b, c, uitkomst;
	
	
    public void init() {
        a = 113;
        c = 4;
        uitkomst = ( a / c);
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}
