package h13;

import java.applet.*;
 import java.awt.*;
 public class Opdracht2 extends Applet {

public void paint (Graphics g) {
      g.setColor (Color.green);
      int  x1,  y1,  x2,  y2,  x3,  y3;
      // We start with point (160,120)
      x1 = x2 = x3 = 160;
      y1 = y2 = y3 = 120;
      for (int i=0; i<100; i++)  {
           tekenDriehoek (g, x1, y1, x2, y2, x3, y3);
           y1--;  x2--;  y2++;  x3++;  y3++;
      }
      g.setColor (Color.black);
      tekenDriehoek (g,x1,y1,x2,y2,x3,y3);
 }

 void tekenDriehoek (Graphics g, int x1, int y1,
                             int x2, int y2, int x3, int y3)  {
      g.drawLine (x1, y1, x2, y2);
      g.drawLine (x2, y2, x3, y3);
      g.drawLine (x3, y3, x1, y1);
 } 
 }
