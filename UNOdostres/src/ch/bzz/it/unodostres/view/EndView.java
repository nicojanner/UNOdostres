package ch.bzz.it.unodostres.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import ch.bzz.it.unodostres.controller.Card;
import ch.bzz.it.unodostres.controller.Player;

public class EndView extends JFrame {

	JLabel titlelbl = new JLabel();
	JLabel player1lbl = new JLabel();
	JLabel player2lbl = new JLabel();
	JLabel player3lbl = new JLabel();
	JLabel player4lbl = new JLabel();
	JButton backBtn = new JButton("Back to Start");
	JButton againBtn = new JButton("Play again");
	JPanel mainPanel = new JPanel();
	JPanel btnPanel = new JPanel();

	public EndView(Player player1, Player player2, Player player3, Player player4, ArrayList<Card> stack) {
		setTitle("UNOdostres");
		getContentPane().setLayout(new BorderLayout());
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		btnPanel.setLayout(new FlowLayout());
		againBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
		backBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
		titlelbl.setAlignmentX(Component.CENTER_ALIGNMENT);
		titlelbl.setFont(new Font("Arial", Font.PLAIN, 40));
		player1lbl.setAlignmentX(Component.CENTER_ALIGNMENT);
		player2lbl.setAlignmentX(Component.CENTER_ALIGNMENT);
		player3lbl.setAlignmentX(Component.CENTER_ALIGNMENT);
		player4lbl.setAlignmentX(Component.CENTER_ALIGNMENT);
		player1lbl.setForeground(Color.YELLOW);
		player2lbl.setForeground(Color.YELLOW);
		player3lbl.setForeground(Color.YELLOW);
		player4lbl.setForeground(Color.YELLOW);
		backBtn.setBackground(Color.YELLOW);
		backBtn.setForeground(Color.RED);
		backBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new StartView(player1, player2, player3, player4, stack);

			}
		});
		againBtn.setBackground(Color.YELLOW);
		againBtn.setForeground(Color.RED);
		againBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				player1.setPoints(0);
				player2.setPoints(0);
				player3.setPoints(0);
				player4.setPoints(0);
				new MainView(player1, player2, player3, player4, stack);

			}
		});

		titlelbl.setForeground(Color.YELLOW);
		btnPanel.add(backBtn);
		btnPanel.add(againBtn);
		titlelbl.setText(player1 + "WOOOOOOOOON!!!!!");
		player1lbl.setText(player1.getName() + ": " + player1.getPoints() + " Points");
		player2lbl.setText(player2.getName() + ": " + player2.getPoints() + " Points");
		player3lbl.setText(player3.getName() + ": " + player3.getPoints() + " Points");
		player4lbl.setText(player4.getName() + ": " + player4.getPoints() + " Points");
		mainPanel.add(titlelbl);
		mainPanel.add(player1lbl);
		mainPanel.add(player2lbl);
		mainPanel.add(player3lbl);
		mainPanel.add(player4lbl);
		mainPanel.add(btnPanel);
		getContentPane().add(mainPanel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainPanel.setBackground(Color.RED);
		btnPanel.setBackground(Color.RED);
		setVisible(true);
		setResizable(false);
		pack();
	}
}
