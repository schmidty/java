import java.*;
import java.awt.*;
import javax.swing.*;


public class TestFrameExample {

	public static void main(String string[]) {
		JFrame frame = new JFrame("Matt's JFrame Example");

		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());

		JLabel label = new JLabel("This is a label!");

		JButton button = new JButton("Press Me!");
		button.setText("Press me!");
		button.setActionCommand("Press me!");
		button.addActionListener(new ButtonClickListener());

		panel.add(label);
		panel.add(button);

		frame.add(panel);
		frame.setSize(300,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
