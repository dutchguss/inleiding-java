package praktijkopdrachten;




import java.applet.Applet;

import java.awt.Button;

import java.awt.Graphics;

import java.awt.TextField;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;










public class H11_2 extends Applet

{

	int tafelinput;

	int i, x, y;

	TextField vak1;
Button keer;
	

	public void init()

	{
keer = new Button("volgende tafel");
		setSize(300,500);

		tafelinput = 0;

		Listen1 l1 = new Listen1();

		keer.addActionListener(l1);
		add(keer);

		

	}

	public void paint(Graphics g)

	{

		 x = 60;

		 y = 60;

	 if (tafelinput>0)

	{

		for(i = 0; i<10;)

		{

			y = y+20;

			i++;

			g.drawString(i+"x"+tafelinput+"="+tafelinput*i, x, y);

		}

	 }


	}

	class Listen1 implements ActionListener

	{

		public void actionPerformed(ActionEvent e)

		{

			tafelinput++;

			repaint();

		}

	}

}