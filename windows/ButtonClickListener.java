import java.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ButtonClickListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();

		if (command.equals("Press me!")) {
			// Used: http://stackoverflow.com/questions/21247208/display-pop-up-message-window-in-java
			String name = JOptionPane.showInputDialog(null, "I Love Coding", null);
			System.out.println("Do you really love coding " + name + "?");
		}
	}
}
