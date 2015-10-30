package praktijkopdrachten;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H12 extends Applet {

	Label naam = new Label("Naam: ");
	Label N = new Label("Telefoonnummer: ");
	TextField iets = new TextField("", 15);
	TextField inputNumber = new TextField("", 15);
	Button ok = new Button("OK");
	String[] stringName = new String[10];
	String[] stringNumber = new String[10];
	int count = 0;
	
	public void init() {
		setSize(600, 200+35*stringName.length);
		add(naam);
		add(iets);
		iets.addActionListener(new InputListener());
		add(N);
		add(inputNumber);
		inputNumber.addActionListener(new InputListener());
		add(ok);
		ok.addActionListener(new InputListener());
		for (int i = 0; i < stringName.length; i++) {
			stringName[i] = "";
			stringNumber[i] = "";
		}
	}
	
	public void paint(Graphics g) {
		int x = getWidth();
		int y = getHeight();
		
		for (int i = 0; i < stringName.length; i++) {
			if (count == 10) {
				g.drawString(""+ stringName[i], x/2-100, (y/2-35*stringName.length/2)+35*i);
				g.drawString(""+ stringNumber[i], x/2-100, (y/2-35*stringName.length/2)+15+35*i);
			}
		}
	}
	
	class InputListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			count++;
			stringName[(count-1)] = "Naam: "+ iets.getText();
			stringNumber[(count-1)] = "Telefoonnummer: "+ inputNumber.getText();
			iets.setText("");
			inputNumber.setText("");
			iets.requestFocus();
			repaint();
		}
	}
}
