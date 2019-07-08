package ch.bzz.it.unodostres.view;

import ch.bzz.it.unodostres.controller.Player;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartView extends JFrame {

	private static final long serialVersionUID = 1L;

	JButton startButton = new JButton("Start");
	JPanel buttonPanel = new JPanel();
	JLabel imageLabel = new JLabel(new ImageIcon(StartView.class.getResource("/startScreen.jpg")));

	public StartView(Player player1, Player player2, Player player3, Player player4) {
		setTitle("UNOdostres");
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(imageLabel);
		buttonPanel.add(startButton, BorderLayout.SOUTH);
		getContentPane().add(buttonPanel, BorderLayout.SOUTH);
		startButton.setFont(new Font("Arial", Font.PLAIN, 40));
		startButton.setBackground(Color.RED);
		startButton.setForeground(Color.YELLOW);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		pack();

		startButton.addActionListener(e -> {
			dispose();
			new PlayernameView(player1, player2,player3, player4);

		});

	}
}
