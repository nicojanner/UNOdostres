package ch.bzz.it.unodostres.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class EndView extends JFrame {

	public EndView() {
		setTitle("UNOdostres");
		getContentPane().setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		pack();
	}
}
