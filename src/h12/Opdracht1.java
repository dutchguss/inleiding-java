package h12;

import java.awt.*;
import java.applet.*;

public class Opdracht1 extends Applet  {
    int[] salaris;
    int[] kopie;
    int gemiddelde;
	double salaris2;
    public void init() {
        salaris = new int[10];
        kopie = new int[5];

        for (int teller = 0; teller < salaris.length; teller ++) {
            salaris[teller] = 15 * teller + 1;
        }
        kopie = salaris;
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < salaris.length; teller ++) {
        	gemiddelde += salaris[teller];
        	salaris2 = gemiddelde / 10;

            g.drawString("" + salaris[teller], 100, 20 * teller + 20);
            
            
        }
        g.drawString(""+salaris2, 10, 20);
        	
        }
       
    }
    


