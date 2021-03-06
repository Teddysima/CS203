import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Gui1 {

	private JButton goodbyeButton;
	private JButton helloButton;
	private JFrame frame;
	private JLabel label;

	public static void main(String[] args) {
		Gui1 g = new Gui1();
		g.doThings();
	}

	public void doThings() {
		frame = new JFrame("Teddy application!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 300);

		goodbyeButton = new JButton("Good Bye");
		frame.getContentPane().add(BorderLayout.SOUTH, goodbyeButton);
		goodbyeButton.addActionListener(new GoodbyeListener());

		helloButton = new JButton("Hello");
		frame.getContentPane().add(BorderLayout.NORTH, helloButton);
		helloButton.addActionListener(new HelloListener());

		label = new JLabel("Nothing yet");
		frame.getContentPane().add(BorderLayout.WEST, label);

		frame.setVisible(true);
	}

	private class HelloListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setText("Hello");
		}
	}

	private class GoodbyeListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Good Bye");
		}
	}

}