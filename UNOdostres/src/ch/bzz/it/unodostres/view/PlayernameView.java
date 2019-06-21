package ch.bzz.it.unodostres.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class PlayernameView extends JFrame {

	public PlayernameView() {
		setTitle("UNOdostres");
		getContentPane().setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		setSize(1612, 879);
	}
}
