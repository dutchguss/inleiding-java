package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht4 extends Applet {
    TextField tekstvak;
    Label label;				
    String s, tekst;
    int dag;
    int jaar;
	
    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type het maandnummer en druk op enter");
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
            jaar = Integer.parseInt(s);
            switch(dag) {
            case 1:  tekst = "januari 31 dagen";
            break;
            case 2: tekst = "februari 29 dagen";
            break;
            case 3: tekst = "maart 31 dagen";
            break;
            case 4: tekst = "april 30 dagen";
            break;
            case 5: tekst = "mei 31 dagen";
            break;
            case 6:
                    tekst = "juni 30 dagen";
                    break;
                case 7:
                    tekst = "juli 31 dagen";
                    break;
                case 8:
                    tekst = "augustus 31 dagen";
                    break;
                case 9:
                    tekst = "september 30 dagen";
                    break;
                case 10:
                    tekst = "oktober 31 dagen";
                    break;
                case 11:
                    tekst = "november 30 dagen";
                    break;
                case 12:
                    tekst = "december 31 dagen";
                    break;
        default:
            tekst = "u heeft niet het juiste getal ingevuld";
            break;}
                    switch(jaar){
                case 2000:
                	tekst = "dit is een schrikkeljaar";
                case 2004:
                	tekst = "dit is een schrikkeljaar";
                	break;
                case 2008:
                	tekst = "dit is een schrikkeljaar";
                	break;
                case 2012:
                	tekst = "dit is een schrikkeljaar";
                	break;
                case 2016:
                	tekst = "dit is een schrikkeljaar";
                	break;
                case 2020:
                	tekst = "dit is een schrikkeljaar";
                	break;
               case 2024:
                	tekst = "dit is een schrikkeljaar";
                	break;
                case 2028:
                	tekst = "dit is een schrikkeljaar";
                	break;
                case 2032:
                	tekst = "dit is een schrikkeljaar";
                	break;
                case 2036:
                	tekst = "dit is een schrikkeljaar";
                	break;
               case 2040:
                	tekst = "dit is een schrikkeljaar";
                	break;
                case 2044:
                	tekst = "dit is een schrikkeljaar";
                	break;
                case 2048:
                	tekst = "dit is een schrikkeljaar";
                	break;
                case 2052:
                	tekst = "dit is een schrikkeljaar";
                default:
                    tekst = "dit is geen scrikkeljaar";
                    break;
            
                    }
            repaint();
        }
    }
}

