package h12;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht5 extends Applet {
	
	int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -43, 1984, 235240, -3000, 22, 2016};
	TextField nummers = new TextField("", 5);
	Button ok = new Button("OK");
	String string = "";
	boolean vind = false;
	int index = -1;
	
	public void init() {
		setSize(400, 400);
		add(nummers);
		nummers.addActionListener(new InputListener());
		add(ok);
		ok.addActionListener(new InputListener());
	}
	
	public void paint(Graphics g) {
		int x = getWidth();
		int y = getHeight();
		
		g.drawString(""+ string, x/2-100, y/2);
	}
	
	class InputListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int search = Integer.parseInt(nummers.getText());
			for (int i = 0; i < numbers.length && vind == false; i++) {
				index++;
				if (numbers[i] == search) {
					vind = true;
				}
			}
			if (vind == true) {
				string = "De waarde is gevonden onder de index "+ index +".";
			} else {
				string = "De waarde is niet gevonden.";
			}
			index = -1;
			nummers.setText("");
			vind = false;
			repaint();
		}
	}

}