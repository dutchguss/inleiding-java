package h04;
import java.awt.*;
import java.applet.*;

@SuppressWarnings("serial")
public class Vlag extends Applet {

  public void init() {
  }

  public void paint(Graphics g) {
    setBackground(Color.yellow);
    g.setColor(Color.orange);
      g.fillRect(52, 100, 20, 280);
      g.setColor(Color.red);
      g.fillRect(52, 100, 120, 60);
      g.setColor(Color.white);
      g.fillRect(52, 160, 120, 60);
      g.setColor(Color.blue);
      g.fillRect(52, 220, 120, 60);
     
  }
}