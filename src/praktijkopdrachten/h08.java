package praktijkopdrachten;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ACHCHUTHAN
 */
public class h08 extends JApplet implements ActionListener {

    public h08() {
        display = new JTextField("0");
        display.setEditable(false);
        add(display, "North");
        JPanel p = new JPanel();
        String buttons = "1234567890*-/.+=";
        for (int i = 0; i < buttons.length(); i++) {
            addButton(p, buttons.substring(i, i + 1));
        }
        add(p, "Center");
    }

    private void addButton(Container c, String s) {
        JButton b = new JButton(s);
        c.add(b);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String s = ae.getActionCommand();
        if ('0' < s.charAt(0) && s.charAt(0) <= '9' || s.equals(".")) {
            if (start) {
                display.setText(s);
            } else {
                display.setText(display.getText() + s);
            }
            start = false;
        } else {
            if (start) {
                if (s.equals("=")) {
                    display.setText(s);
                    start = false;
                } else {
                    op = s;
                }
            } else {
                double x = Double.parseDouble(display.getText());
                Calculate(x);
                op = s;
                start = true;
            }
        }
    }

    public void Calculate(double n) {
        if (op.equals("+")) {
            arg += n;
        } else if (op.equals("-")) {
            arg -= n;
        } else if (op.equals("*")) {
            arg *= n;
        } else if (op.equals("/")) {
            arg /= n;
        } else if (op.equals("=")) {
            arg = n;
        }
        display.setText(" " + arg);

    }
    private JTextField display;
    private double arg = 0;
    private String op = "=";
    private boolean start = true;
}