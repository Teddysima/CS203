package com.teddy.tictactoe;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Guiboard {

	public static void main(String args[]) {
		Guiboard g = new Guiboard();
		g.doThings();
	}

	public void doThings() {
		JFrame frame = new JFrame("TicTacToe");
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();

		ButtonListener bl = new ButtonListener();
		
		JButton a = new JButton();
		a.setPreferredSize(new Dimension(100, 100));
		a.addActionListener(bl);

		JButton b = new JButton();
		b.setPreferredSize(new Dimension(100, 100));
		b.addActionListener(bl);

		JButton c = new JButton();
		c.setPreferredSize(new Dimension(100, 100));
		c.addActionListener(bl);

		JButton d = new JButton();
		d.setPreferredSize(new Dimension(100, 100));
		d.addActionListener(bl);

		JButton e = new JButton();
		e.setPreferredSize(new Dimension(100, 100));
		e.addActionListener(bl);

		JButton f = new JButton();
		f.setPreferredSize(new Dimension(100, 100));
		f.addActionListener(bl);

		JButton g = new JButton();
		g.setPreferredSize(new Dimension(100, 100));
		g.addActionListener(bl);

		JButton h = new JButton();
		h.setPreferredSize(new Dimension(100, 100));
		h.addActionListener(bl);

		JButton i = new JButton();
		i.setPreferredSize(new Dimension(100, 100));
		i.addActionListener(bl);

		p1.add(a);
		p1.add(b);
		p1.add(c);
		p2.add(d);
		p2.add(e);
		p2.add(f);
		p3.add(g);
		p3.add(h);
		p3.add(i);

		JPanel outer = new JPanel();
		outer.setLayout(new BoxLayout(outer, BoxLayout.Y_AXIS));
		outer.add(p1);
		outer.add(p2);
		outer.add(p3);

		p1.setPreferredSize(new Dimension(200, 300));
		p2.setPreferredSize(new Dimension(200, 300));
		p3.setPreferredSize(new Dimension(200, 300));
		frame.getContentPane().add(BorderLayout.CENTER, outer);

		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	private class ButtonListener implements ActionListener {
		
		byte value = 0;

	
		public void actionPerformed(ActionEvent e) {
			
			JButton button = (JButton) e.getSource();
			
			value ++;
			value %= 3;
			switch(value){
			case 0:
				button.setText(null);
				break;
			case 1:
				button.setText("X");
				break;
			case 2:
				button.setText("O");
				break;
			
			}	
					
		}
	}
}