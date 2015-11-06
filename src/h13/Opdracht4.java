package h13;

import java.applet.Applet;

import java.awt.Button;
import java.awt.Color;


import java.awt.Graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht4 extends Applet {
	Color cement = new Color(241, 241, 241 );
	Color color = null;
	Button redBrick = new Button("Rode bakstenen");
	Button grayBeton = new Button("Grijze betonblokken");
	int sz = 0;
	
	public void init() {
		 setSize(1920,953);
		add(redBrick);
		redBrick.addActionListener(new RedListener());
		add(grayBeton);
		grayBeton.addActionListener(new GrayListener());
	}
	
	public void paint(Graphics g) {
		buildWall(g);
		setBackground(cement);
	}
	
	void buildWall(Graphics g) {
		g.setColor(color);
		for (int iRow = 0; 2+22*iRow < getHeight(); iRow++) {
			for (int iCol = 0; 2+52*(iCol-1) < getWidth(); iCol++) {
				if (iRow % 2 == 0) {g.fillRect(sz*(2+52*iCol), sz*(2+22*iRow), sz*50, sz*20);}
				else {g.fillRect(sz*(-25+52*iCol), sz*(2+22*iRow), sz*50, sz*20);}
			}
		}
	}
	
	class RedListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			color = Color.red;
			sz = 1;
			repaint();
		}
	}
	
	class GrayListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			color = Color.lightGray;
			sz = 7;
			repaint();
		}
	}
}