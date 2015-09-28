package h06;
import java.awt.*;
import java.applet.*;


@SuppressWarnings("serial")
public class opdracht62 extends Applet {
    int a, b, c, d, e, uitkomst, uitkomst2, uitkomst3;
	
	
    public void init() {
        
    	a = 60;
        b = 3600;
        c = 60;
        d = 24;
        e = 365;
        uitkomst = ( a * c);
        uitkomst2 = (uitkomst * d );
        uitkomst3 = (uitkomst2 * e);
    }

    public void paint(Graphics g) {
      
		g.drawString("1 uur " + uitkomst , 20, 20);
		g.drawString("1 dag "+ uitkomst2 +"" , 20, 31);
		g.drawString("1 jaar"+ uitkomst3, 20, 43);
    }
}
