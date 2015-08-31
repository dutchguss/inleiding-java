package praktijkopdrachten;
import java.awt.*;
import java.applet.*;


@SuppressWarnings("serial")
public class h06 extends Applet {
    double a, b, c, d,e, uitkomst2, uitkomst3;
    double uitkomst;
	
	
    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        d = 3;
        e = 10;
        uitkomst =( (a + b + c) / d * e);
        uitkomst = (int) uitkomst;
        uitkomst = uitkomst / 10;}
    public void paint(Graphics g) {
      
		g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}
