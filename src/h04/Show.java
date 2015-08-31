package h04;
import java.awt.*;
import java.applet.*;

@SuppressWarnings("serial")
public class Show extends Applet {

  public void init() {
  }

  public void paint(Graphics g) {
    setBackground(Color.white);
    g.setColor(Color.black);
    int[] xPoints = {100,50,150};
    int[] yPoints = {100,200,200};
    g.drawPolygon(xPoints, yPoints, 3);

  }
}
