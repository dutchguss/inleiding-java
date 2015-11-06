import java.applet.*;
import java.awt.*;
import java.awt.event.*;


public class BeepFiveApplet extends Applet  {
  
   public void init () {
   
     // Construct the button
     Button beep = new Button("Beep");

     // add the button to the layout
     this.add(beep);

     // specify that action events sent by this
     // button should be handled by the applet itself
     beep.addActionListener(new MultiBeepAction());
     beep.setActionCommand("5");
   
   }
   
}

class MultiBeepAction implements ActionListener {

  public void actionPerformed(ActionEvent ae) {

    int n;
    try {
      n = Integer.parseInt(ae.getActionCommand());
    }
    catch (NumberFormatException e) {
      n = 1;
    }
    Toolkit tk = Toolkit.getDefaultToolkit();
    for (int i = 0; i < n; i++) tk.beep();

  }

}