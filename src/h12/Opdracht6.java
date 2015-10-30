package h12;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht6 extends Applet {
	
	int[] numbers = {0, 1, 2, 3, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6, 6, 7, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10};
	TextField nummers = new TextField("", 5);
	Button ja = new Button("OK");
	String string = "";
	int tell = 0;
	
	public void init() {
		setSize(400, 400);
		add(nummers);
		nummers.addActionListener(new InputListener());
		add(ja);
		ja.addActionListener(new InputListener());
	}
	
	public void paint(Graphics g) {
		int x = getWidth();
		int y = getHeight();
		
		g.drawString(""+ string, x/2-100, y/2);
	}
	
	class InputListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int search = Integer.parseInt(nummers.getText());
			for (int i = 0; i < numbers.length; i++) {
				if (numbers[i] == search) {tell++;}
			}
			if (tell > 0) {
				string = "De waarde is "+ tell +" keer gevonden.";
			} else {
				string = "De waarde is niet gevonden.";
			}
			tell = 0;
			nummers.setText("");
			repaint();
		}
	}

}