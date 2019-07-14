package ch.bzz.it.unodostres.view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ch.bzz.it.unodostres.controller.Card;
import ch.bzz.it.unodostres.controller.Player;

public class PlayernameView extends JFrame {

    JLabel title = new JLabel("Choose your name");
    JLabel playername1Label = new JLabel("Player 1:");
    JLabel playername2Label = new JLabel("Player 2:");
    JLabel playername3Label = new JLabel("Player 3:");
    JLabel playername4Label = new JLabel("Player 4:");

    JTextField playername1Tf = new JTextField("");
    JTextField playername2Tf = new JTextField("");
    JTextField playername3Tf = new JTextField("");
    JTextField playername4Tf = new JTextField("");

    JButton playButton = new JButton("Play");

    JPanel inputPanel = new JPanel();


    public PlayernameView(Player player1, Player player2, Player player3, Player player4, ArrayList<Card> stack) {
        setTitle("UNOdostres");
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        title.setFont(new Font("Arial", Font.PLAIN, 75));
        title.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        getContentPane().add(title);
        inputPanel.setLayout(new GridLayout(4, 2));
        inputPanel.add(playername1Label);
        inputPanel.add(playername1Tf);
        inputPanel.add(playername2Label);
        inputPanel.add(playername2Tf);
        inputPanel.add(playername3Label);
        inputPanel.add(playername3Tf);
        inputPanel.add(playername4Label);
        inputPanel.add(playername4Tf);
        playButton.setFont(new Font("Arial", Font.PLAIN, 40));
        playButton.addActionListener(e -> {
            player1.setName(playername1Tf.getText());
            player2.setName(playername2Tf.getText());
            player3.setName(playername3Tf.getText());
            player4.setName(playername4Tf.getText());
            dispose();
            new MainView(player1, player2, player3, player4, stack);
        });
        getContentPane().add(inputPanel);
        getContentPane().add(playButton);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setSize(1612, 879);
    }

}
