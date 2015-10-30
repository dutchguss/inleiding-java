package h13;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht1 extends Applet {
Button blue, yellow, red, lime, orange, pink;
String Kleur;

public void init(){
	blue = new Button("Blue");
	yellow = new Button("Yellow");
	red = new Button("Red");
	lime = new Button("Green");
	orange = new Button("Orange");
	pink = new Button("pink");
	BlueButton blu = new BlueButton();
	blue.addActionListener(blu);
	YellowButton Yell = new YellowButton();
	yellow.addActionListener(Yell);
	RedButton Red = new RedButton();
	red.addActionListener(Red);
	LimeButton lim = new LimeButton();
	lime.addActionListener(lim);
	OrangeButton Ora = new OrangeButton();
	orange.addActionListener(Ora);
	PinkButton Pin = new PinkButton();
	pink.addActionListener(Pin);
	add(blue);
	add(yellow);
	add(red);
	add(lime);
	add(orange);
	add(pink);
}
	public void paint (Graphics g){
		blue.setBackground(Color.blue);
		yellow.setBackground(Color.yellow);
		red.setBackground(Color.red);
		lime.setBackground(Color.green);
		orange.setBackground(Color.orange);
		
		pink.setBackground(Color.pink);

		g.drawString(""+Kleur, 50, 50);
		
	}
	class BlueButton implements ActionListener{
		public void actionPerformed( ActionEvent e ) {
blue.setName("Blue");
setBackground(Color.blue);
		Kleur = blue.getName();
		repaint();
		}
	}
	class YellowButton implements ActionListener{
		public void actionPerformed( ActionEvent e ) {
yellow.setName("Yellow");
setBackground(Color.yellow);
		Kleur = yellow.getName();
		repaint();
		}
	}
	class RedButton implements ActionListener{
		public void actionPerformed( ActionEvent e ) {
red.setName("Red");
setBackground(Color.red);
		Kleur = red.getName();
		repaint();
		}
	}
	class LimeButton implements ActionListener{
		public void actionPerformed( ActionEvent e ) {
lime.setName("Green");
setBackground(Color.green);
		Kleur = lime.getName();
		repaint();
		}
	}
	class OrangeButton implements ActionListener{
		public void actionPerformed( ActionEvent e ) {
orange.setName("Orange");
setBackground(Color.orange);
		Kleur = orange.getName();
		repaint();
		}
	}
	class PinkButton implements ActionListener{
		public void actionPerformed( ActionEvent e ) {
pink.setName("Pink");
setBackground(Color.pink);
		Kleur = pink.getName();
		repaint();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
