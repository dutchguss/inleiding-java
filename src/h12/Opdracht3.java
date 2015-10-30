package h12;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

@SuppressWarnings("serial")
public class Opdracht3 extends Applet {
	
	TextField[] textfields = new TextField[5];
	Button reset = new Button("Reset");
	String[] iets = new String[textfields.length];
	String[] geoordenediets = new String[textfields.length];
	int[] sortInt = new int[textfields.length];
	int iSrc = 0;
	
	public void init() {
		setSize(400, 400);
		for (int i = 0; i < textfields.length; i++) {
			textfields[i] = new TextField("", 5);
			add(textfields[i]);
			textfields[i].addActionListener(new InputListener());
		}
		add(reset);
		reset.addActionListener(new ResetListener());
		for (int i = 0; i < textfields.length; i++) {
			iets[i] = "";
			geoordenediets[i] = "";
		}
	}
	
	public void paint(Graphics g) {
		Font currentFont = new Font("Courier New", Font.BOLD+Font.ITALIC, 70);
		g.setFont(currentFont);
		int x = getWidth();
		int y = getHeight();
		for (int i = 0; i < textfields.length; i++) {
			
			g.drawString(""+ iets[i]+"", x/2-((textfields.length/2)-i)*50-15, y/2-15);
			if (iSrc == textfields.length) {
				Arrays.sort(sortInt);
				geoordenediets[i] = ""+ sortInt[i];
				g.drawString(""+ geoordenediets[i], x/2-((textfields.length/2)-i)*50, y/2+80);
			}
		}
	}
	
	class InputListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			TextField src = (TextField)e.getSource();
			iets[iSrc] = ""+ Integer.parseInt(src.getText());
			sortInt[iSrc] = Integer.parseInt(src.getText());
			iSrc++;
			repaint();
		}
	}
	
	class ResetListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			for (int i = 0; i < textfields.length; i++) {
				textfields[i].setText(" ");
				textfields[i].setText("");
				geoordenediets[i] = "";
				iets[i] = "";
			}
			iSrc = 0;
			textfields[0].requestFocus();
			repaint();
		}
	}

}