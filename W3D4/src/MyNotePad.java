import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.swing.JButton;

public class MyNotePad implements Serializable {
	private JTextArea text = new JTextArea(20, 30);

	public static void main(String[] args) {
		MyNotePad mnp = new MyNotePad();
		mnp.doThings();
	}

	public void doThings() {

		JFrame frame = new JFrame("Teddy NotePad");

		JButton save = new JButton("Save");
		save.addActionListener(new SaveListener());

		JButton load = new JButton("Load");
		load.addActionListener(new LoadListener());

		JPanel outer = new JPanel();

		outer.add(save);
		outer.add(load);

		text.setLineWrap(true);
		JScrollPane scroller = new JScrollPane(text);
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		JPanel p1 = new JPanel();
		p1.add(scroller);

		frame.getContentPane().add(BorderLayout.CENTER, p1);
		frame.getContentPane().add(BorderLayout.SOUTH, outer);

		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private class SaveListener implements ActionListener, Serializable {

		@Override
		public void actionPerformed(ActionEvent ae) {
			try {
				FileOutputStream fos = new FileOutputStream("notepad.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(text.getText());
				oos.close();
			} catch (Exception ex) {
				System.out.println("Error is found");
			}
		}
	}

	private class LoadListener implements ActionListener, Serializable {

		@Override
		public void actionPerformed(ActionEvent ae) {
			try {
				FileInputStream fis = new FileInputStream("notepad.txt");
				ObjectInputStream ios = new ObjectInputStream(fis);
				String i = (String) ios.readObject();
				text.setText(i);
				ios.close();
			} catch (Exception ex) {
				System.out.println("Error is found");
			}
		}
	}

}
