package toetsen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

@SuppressWarnings("serial")
public class H1_tm_H10 extends Applet
{
	int tijd, sydney, londen, newyork, tokyo;
	TextField vak1;
	public void init()
	{
		vak1 = new TextField("",15);
		tijd = 0;	
		Listen1 OK = new Listen1();
		vak1.addActionListener(OK);
		add(vak1);
	}
	public void paint(Graphics g)
	{
		if (tijd<24)
		{
			g.drawString("sydney: "+sydney+":00", 10, 50);
			g.drawString("new york: "+newyork+":00", 50, 60);
			g.drawString("tokyo: "+tokyo+":00", 100, 70);
			g.drawString("Londen: "+londen+":00", 150, 80);
					
		}
		else
		{
			g.drawString("ERROR: voer een geldig uur in!!", 20, 80);
		}
	}
	class Listen1 implements ActionListener
	{
		public void actionPerformed( ActionEvent e)
		{
			tijd = Integer.parseInt(vak1.getText());
			if (tijd<24)
			{
			sydney = tijd + 9;
			if (sydney>23)
			{
				sydney = sydney - 24;
			}
			tokyo = tijd+7;
			if (tokyo>23)
			{
				tokyo = tokyo - 24;
			}
			newyork = tijd-6;
			if (newyork< 0)
			{
				newyork = newyork + 24;
			}
			londen = tijd - 1;
			if (londen< 0)
			{
				londen = londen + 24;
			}
			repaint();
			}
		}
	}
}