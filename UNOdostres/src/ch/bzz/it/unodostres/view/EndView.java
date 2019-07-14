package ch.bzz.it.unodostres.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
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

/** 
 * Class represents the endview, when a player has won a round
 * @author Nico Janner, Besfort Dauti
 * @version 1.0
*/
public class EndView extends JFrame {

	private static final long serialVersionUID = 1L;
	
	JLabel titlelbl = new JLabel();
	JButton backBtn = new JButton("Back to Start");
	JButton againBtn = new JButton("Play again");
	JPanel mainPanel = new JPanel();
	JPanel btnPanel = new JPanel();

	public EndView(Player player1, Player player2, Player player3, Player player4, ArrayList<Card> stack, String name) {
		setTitle("UNOdostres");
		getContentPane().setLayout(new BorderLayout());
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		mainPanel.setPreferredSize(new Dimension(1200, 700));
		btnPanel.setLayout(new FlowLayout());
		againBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
		backBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
		titlelbl.setAlignmentX(Component.CENTER_ALIGNMENT);
		titlelbl.setFont(new Font("Arial", Font.PLAIN, 40));
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

		titlelbl.setForeground(Color.BLACK);
		btnPanel.add(backBtn);
		btnPanel.add(againBtn);
		if (!name.equals("")) {
			titlelbl.setText(name + " WOOOON!!!!!");
		} else {
			titlelbl.setText("Unnamed" + " WOOOON!!!!!");
		}
		mainPanel.add(titlelbl);
		mainPanel.add(btnPanel);
		getContentPane().add(mainPanel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainPanel.setBackground(Color.RED);
		btnPanel.setBackground(Color.RED);
		mainPanel.setSize(1000, 500);
		setVisible(true);
		setResizable(false);
		pack();
	}
}
