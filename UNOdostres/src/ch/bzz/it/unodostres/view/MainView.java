package ch.bzz.it.unodostres.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.*;

import ch.bzz.it.unodostres.controller.Card;
import ch.bzz.it.unodostres.controller.Player;

public class MainView extends JFrame {

	private static final long serialVersionUID = 1L;

	JLabel pointsPlayer1 = new JLabel();
	JLabel pointsPlayer2 = new JLabel();
	JLabel pointsPlayer3 = new JLabel();
	JLabel pointsPlayer4 = new JLabel();

	JLabel playerName1 = new JLabel();
	JLabel playerName2 = new JLabel();
	JLabel playerName3 = new JLabel();
	JLabel playerName4 = new JLabel();
	JLabel tableLabel = new JLabel();

	JPanel pointsPanel = new JPanel();
	JPanel mainPanel = new JPanel();
	JPanel gamePanel = new JPanel();
	JPanel player1CardPanel = new JPanel();
	JPanel player2CardPanel = new JPanel();
	JPanel player3CardPanel = new JPanel();
	JPanel player4CardPanel = new JPanel();

	private ArrayList<Card> cards1 = new ArrayList<Card>();
	private ArrayList<Card> cards2 = new ArrayList<Card>();
	private ArrayList<Card> cards3 = new ArrayList<Card>();
	private ArrayList<Card> cards4 = new ArrayList<Card>();

	public MainView(Player player1, Player player2, Player player3, Player player4) {
		setTitle("UNOdostres");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setSize(1612, 879);
		player1CardPanel.setLayout(new FlowLayout());
		player2CardPanel.setLayout(new BoxLayout(player2CardPanel, BoxLayout.Y_AXIS));
		player3CardPanel.setLayout(new FlowLayout());
		player4CardPanel.setLayout(new BoxLayout(player2CardPanel, BoxLayout.Y_AXIS));
		cards1 = player1.getCards();
		cards2 = player1.getCards();
		cards3 = player1.getCards();
		cards4 = player1.getCards();

		pointsPanel.setLayout(new FlowLayout());
		pointsPanel.add(pointsPlayer1);
		pointsPanel.add(pointsPlayer2);
		pointsPanel.add(pointsPlayer3);
		pointsPanel.add(pointsPlayer4);
		getContentPane().add(pointsPanel, BorderLayout.WEST);
		tableLabel.setPreferredSize(new Dimension(800, 600));
		tableLabel.setBackground(Color.WHITE);
		tableLabel.setBorder(BorderFactory.createLineBorder(Color.black));
		gamePanel.setLayout(new BorderLayout(30, 30));
		playerName1.setHorizontalAlignment(JLabel.CENTER);
		playerName3.setHorizontalAlignment(JLabel.CENTER);
		playerName1.setText(player1.getName());
		playerName2.setText(player2.getName());
		playerName3.setText(player3.getName());
		playerName4.setText(player4.getName());
		pointsPlayer1.setText(player1.getName() + ": " + player1.getPoints() + " Points");
		pointsPlayer2.setText(player2.getName() + ": " + player2.getPoints() + " Points");
		pointsPlayer3.setText(player3.getName() + ": " + player3.getPoints() + " Points");
		pointsPlayer4.setText(player4.getName() + ": " + player4.getPoints() + " Points");
		gamePanel.add(playerName1, BorderLayout.NORTH);
		gamePanel.add(playerName2, BorderLayout.EAST);
		gamePanel.add(playerName3, BorderLayout.SOUTH);
		gamePanel.add(playerName4, BorderLayout.WEST);
		gamePanel.add(tableLabel, BorderLayout.CENTER);
		mainPanel.add(gamePanel);
		getContentPane().add(mainPanel, BorderLayout.CENTER);

		setVisible(true);
	}

}
