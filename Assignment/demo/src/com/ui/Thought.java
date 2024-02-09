package com.ui;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Thought extends JFrame {
	JLabel l1, l2;

	public Thought() {
		l1 = new JLabel("Success is about who you are, not what you have.");
		l2 = new JLabel("-Bo Bennett");
		add(l1);
		add(l2);

		l1.setBounds(50, 50, 500, 30);
		l2.setBounds(250, 100, 100, 30);
		setLayout(null);
		setSize(500, 500);
		setVisible(true);
		setTitle("Thought of the day");
	}
}
