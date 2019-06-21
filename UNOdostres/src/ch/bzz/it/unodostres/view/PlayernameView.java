package ch.bzz.it.unodostres.view;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PlayernameView extends JFrame {
	
	JLabel title = new JLabel("Choose your name");
	JLabel playername1Label = new JLabel("Player 1:");
	JLabel playername2Label = new JLabel("Player 2:");
	JLabel playername3Label = new JLabel("Player 3:");
	JLabel playername4Label = new JLabel("Player 4:");

	JTextField playername1 = new JTextField("");
	JTextField playername2 = new JTextField("");
	JTextField playername3 = new JTextField("");
	JTextField playername4 = new JTextField(" ");
	
	JButton playButton = new JButton("Play");
	
	JPanel inputPanel = new JPanel();
	
	public PlayernameView() {
		setTitle("UNOdostres");
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		title.setFont(new Font("Arial", Font.PLAIN, 75));
		title.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		getContentPane().add(title);
		inputPanel.setLayout(new GridLayout(4, 2));
		inputPanel.add(playername1Label);
		inputPanel.add(playername1);
		inputPanel.add(playername2Label);
		inputPanel.add(playername2);
		inputPanel.add(playername3Label);
		inputPanel.add(playername3);
		inputPanel.add(playername4Label);
		inputPanel.add(playername4);
		getContentPane().add(inputPanel);
		getContentPane().add(playButton);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		setSize(1612, 879); 
	}
}
