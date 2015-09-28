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
        g.drawString("Jan " + uitkomst, 20, 20);
        g.drawString("Ali " + uitkomst, 20, 30);
        g.drawString("Jeannette " + uitkomst, 20, 40);
        g.drawString("jij " + uitkomst, 20, 50);
    }
}
