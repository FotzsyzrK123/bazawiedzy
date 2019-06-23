import java.awt.event.*;
import java.awt.Toolkit;
import javax.swing.*;
import java.applet.*;

public class Beeper extends JApplet implements ActionListener{
    
  
    public void init() {
        JButton Btn = new JButton("Graj");
        Btn.addActionListener(this);
        getContentPane().add(Btn);
    }

    public void actionPerformed(ActionEvent e) {
        Toolkit.getDefaultToolkit().beep();
	}
}