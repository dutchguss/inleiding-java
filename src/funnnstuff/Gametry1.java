package funnnstuff;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Gametry1 extends Applet{
Button een, twee, drie, upgrade1, upgrade2, upgrade3,upgrade4;
TextField hallo;
int money;
int y,x;
Color i = new Color(255,165,0);
Color r = new Color(255,215,0);
Label GameOver;

public void init(){
	money = 0;
	een = new Button("Click hier");
	twee = new Button("Back");
	drie = new Button("Color");
	hallo = new TextField();
	upgrade1 = new Button("Koop deze upgrade");
	add(een);
	Politie kl1 = new Politie();
	een.addActionListener(kl1);
	add(upgrade1);
	GameOver = new Label();
add(GameOver);
	y = 100;
	x = 100;
	
}
	public void paint(Graphics g){
		int width;
		int height;
		width = 30;
		height = 200;
		Font iets = new Font("Arial", Font.BOLD, 40);
		g.setFont(iets);
		g.fillOval(90, y, 5, 5);
		
		g.setColor(Color.lightGray);
		g.fillRect(x, y, width, height);
		g.setColor(Color.yellow);
		g.fillOval(x-15, y-20, 60, 60);
		g.setColor(i);
		g.fillOval(90, y, 20, 20);
		g.fillOval(90, y+10, 5, 5);
		g.fillOval(90+7, y-5, 5, 5);
		g.fillOval(90+18, y-5, 5, 5);
		g.setColor(r);
		g.fillOval(90+40, y-5, 5, 5);
		g.drawString(""+money, 200, 200);
		een.setBackground(r);
		een.setLocation(100, 100);
		GameOver.setVisible(false);
		GameOver.setLocation(400, 400);
	}
	
	class Politie implements ActionListener{
		public void actionPerformed(ActionEvent e){
			money++;
			repaint();
			if (money > 10){
				money+=1000000;
			}
			if (money> 100){
			money+=898;
			}
			if (money > 10000){
				money+= 4100;
			}
				
			if (money > 1000000){
				GameOver.setText("GameOver");
			GameOver.setVisible(true);
			money = 0;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
