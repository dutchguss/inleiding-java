package praktijkopdrachten;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class H13_1 extends Applet{
	
	
	public void paint(Graphics g){
		Boom(g);
		Boom2(g);
		
	}
	void Boom (Graphics g){
		int i = 1;
		int xleaves = 75;
		int xtrunk = 115;
		int ytrunk = 175;
		while(i < 6){
        

        g.setColor(Color.green);        
        g.fillOval(xleaves, 75, 100, 100);
        g.setColor(Color.black);
        g.drawOval(xleaves, 75, 100, 100);
  

        g.setColor(new Color(102, 51, 0));
        g.fillRect(xtrunk, ytrunk, 20, 100); 
        xleaves+=105;
        xtrunk+= 105;
        
        i++;
		}
		
		
	}
	void Boom2(Graphics g){
		int i = 1;
		int xleaves = 75;
		int xtrunk = 115;
		int ytrunk = 175;
		while(i < 6){
        

        g.setColor(Color.green);        
        g.fillOval(xleaves, 425, 100, 100);
        g.setColor(Color.black);
        g.drawOval(xleaves, 425, 100, 100);
  

        g.setColor(new Color(102, 51, 0));
        g.fillRect(xtrunk, ytrunk*3, 20, 100); 
        xleaves+=105;
        xtrunk+= 105;
        
        i++;
		}
	}
}

