package praktijkopdrachten;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class H10 extends Applet {
    TextField tekstvak;
    Label label;				
    String s, tekst;
    int dag;
	
    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type het cijfer en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );
    }
	
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            dag = Integer.parseInt( s);
            switch(dag) {
            case 1:  tekst = "1 = slecht";
            break;
            case 2: tekst = "2 = slecht";
            break;
            case 3: tekst = "3 = slecht";
            break;
            case 4: tekst = "4 = onvoldoende";
            break;
            case 5: tekst = "5 = matig";
            break;
            case 6:
                    tekst = "6 = voldoende";
                    break;
                case 7:
                    tekst = "7 = voldoende";
                    break;
                case 8:
                    tekst = "8 = goed";
                    break;
                case 9:
                    tekst = "9 = goed";
                    break;
                case 10:
                    tekst = "10 = goed";
                    break;
                default:
                    tekst = "U hebt een verkeerd nummer ingetikt ..!";
                    break;
            }
            repaint();
        }
    }
}
