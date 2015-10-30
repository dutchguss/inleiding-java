package funnnstuff;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Gametry1 extends Applet{
Button een, twee, drie;
TextField hallo;
Label money;
int y,x;


public void init(){
	money = new Label("");
	een = new Button("Next");
	twee = new Button("Back");
	drie = new Button("Color");
	hallo = new TextField();
	add(een);
	add(hallo);
	add(twee);
	add(drie);
	y = 100;
	x = 100;
	
}
	public void paint(Graphics g){
		int width;
		int height;
		width = 30;
		height = 200;
		g.drawRect(x, y, width, height);
	}
	
	class Politie implements ActionListener{
		public void actionPerformed(ActionEvent e){
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
