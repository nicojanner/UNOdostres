package ch.bzz.it.unodostres.view;

import ch.bzz.it.unodostres.controller.Card;
import ch.bzz.it.unodostres.controller.Game;
import ch.bzz.it.unodostres.controller.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainView extends JFrame {

    private static final long serialVersionUID = 1L;

    private JLabel pointsPlayer1 = new JLabel();
    private JLabel pointsPlayer2 = new JLabel();
    private JLabel pointsPlayer3 = new JLabel();
    private JLabel pointsPlayer4 = new JLabel();

    private JLabel playerName1 = new JLabel();
    private JLabel playerName2 = new JLabel();
    private JLabel playerName3 = new JLabel();
    private JLabel playerName4 = new JLabel();
    private JTextArea tableLabel = new JTextArea();

    private JPanel pointsPanel = new JPanel();
    private JPanel mainPanel = new JPanel();
    private JPanel gamePanel = new JPanel();
    private JPanel player1CardPanel = new JPanel();
    private JPanel player2CardPanel = new JPanel();
    private JPanel player3CardPanel = new JPanel();
    private JPanel player4CardPanel = new JPanel();
    private JPanel player1Panel = new JPanel();
    private JPanel player2Panel = new JPanel();
    private JPanel player3Panel = new JPanel();
    private JPanel player4Panel = new JPanel();

    private ArrayList<Card> cards1;
    private ArrayList<Card> cards2;
    private ArrayList<Card> cards3;
    private ArrayList<Card> cards4;
    private Card card;
    private Game game = new Game(this);
    private JScrollPane scroll = new JScrollPane(tableLabel);

    private Player player11;
    private Player player22;
    private Player player33;
    private Player player44;

    public MainView(Player player1, Player player2, Player player3, Player player4, ArrayList<Card> stack) {
        player11 = player1;
        player22 = player2;
        player33 = player3;
        player44 = player4;
        ClickListener cl = new ClickListener();
        setTitle("UNOdostres");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(1612, 879);
        player1CardPanel.setLayout(new FlowLayout());
        player2CardPanel.setLayout(new BoxLayout(player2CardPanel, BoxLayout.Y_AXIS));
        player3CardPanel.setLayout(new FlowLayout());
        player4CardPanel.setLayout(new BoxLayout(player4CardPanel, BoxLayout.Y_AXIS));
        cards1 = player1.getCards();
        cards2 = player2.getCards();
        cards3 = player3.getCards();
        cards4 = player4.getCards();
        tableLabel.setSize(800,600);
        tableLabel.setBackground(Color.white);
        tableLabel.setBorder(BorderFactory.createLineBorder(Color.black));
        tableLabel.setWrapStyleWord(true);
        tableLabel.setEditable(false);
        card = stack.get(1);
        tableLabel.append(card.getColor() + " " + card.getNumber() + " liegt auf dem Stapel. \n");
        tableLabel.append(player1.getName() + " ist an der Reihe. \n");
        playerName1.setForeground(Color.red);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        for (int i = 0; i < cards1.size(); i++) {
            JButton btn = new JButton(cards1.get(i).getColor() + " " + cards1.get(i).getNumber());
            String colorStr = cards1.get(i).getColor();
            Color color = Color.getColor(colorStr);
            btn.setBackground(color);
            btn.addActionListener(cl);
            player1CardPanel.add(btn);
        }
        for (int i = 0; i < cards2.size(); i++) {
            JButton btn = new JButton(cards2.get(i).getColor() + " " + cards2.get(i).getNumber());
            String colorStr = cards2.get(i).getColor();
            colorStr = colorStr.toUpperCase();
            Color color = Color.getColor(colorStr);
            btn.setBackground(color);
            btn.addActionListener(cl);
            player2CardPanel.add(btn);
        }
        for (int i = 0; i < cards3.size(); i++) {
            JButton btn = new JButton(cards3.get(i).getColor() + " " + cards3.get(i).getNumber());
            String colorStr = cards3.get(i).getColor();
            Color color = Color.getColor(colorStr);
            btn.setBackground(color);
            btn.addActionListener(cl);
            player3CardPanel.add(btn);
        }
        for (int i = 0; i < cards4.size(); i++) {
            JButton btn = new JButton(cards4.get(i).getColor() + " " + cards4.get(i).getNumber());
            String colorStr = cards4.get(i).getColor();
            Color color = Color.getColor(colorStr);
            btn.setBackground(color);
            btn.addActionListener(cl);
            player4CardPanel.add(btn);
        }

        pointsPanel.setLayout(new FlowLayout());
        pointsPanel.add(pointsPlayer1);
        pointsPanel.add(pointsPlayer2);
        pointsPanel.add(pointsPlayer3);
        pointsPanel.add(pointsPlayer4);

        getContentPane().add(pointsPanel, BorderLayout.WEST);

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

        player1Panel.setLayout(new BoxLayout(player1Panel, BoxLayout.Y_AXIS));
        player2Panel.setLayout(new BoxLayout(player2Panel, BoxLayout.Y_AXIS));
        player3Panel.setLayout(new BoxLayout(player3Panel, BoxLayout.Y_AXIS));
        player4Panel.setLayout(new BoxLayout(player4Panel, BoxLayout.Y_AXIS));

        player1Panel.add(playerName1);
        player1Panel.add(player1CardPanel);
        player2Panel.add(playerName2);
        player2Panel.add(player2CardPanel);
        player3Panel.add(playerName3);
        player3Panel.add(player3CardPanel);
        player4Panel.add(playerName4);
        player4Panel.add(player4CardPanel);

        gamePanel.add(player1Panel, BorderLayout.NORTH);
        gamePanel.add(player2Panel, BorderLayout.EAST);
        gamePanel.add(player3Panel, BorderLayout.SOUTH);
        gamePanel.add(player4Panel, BorderLayout.WEST);
        gamePanel.add(scroll, BorderLayout.CENTER);

        mainPanel.add(gamePanel);
        getContentPane().add(mainPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    private void rotatePlayer() {
        if(playerName1.getForeground().equals(Color.blue)) {
            playerName1.setForeground(Color.black);
            playerName2.setForeground(Color.blue);

        }
        if(playerName2.getForeground().equals(Color.blue)) {
            playerName2.setForeground(Color.black);
            playerName3.setForeground(Color.blue);

        }
        if(playerName3.getForeground().equals(Color.blue)) {
            playerName3.setForeground(Color.black);
            playerName4.setForeground(Color.blue);

        }
        if(playerName4.getForeground().equals(Color.blue)) {
            playerName4.setForeground(Color.black);
            playerName1.setForeground(Color.blue);

        }

    }

    private class ClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Object o = e.getSource();
            JButton b = (JButton) o;
            String s = b.getText();
            String[] parts = s.split(" ");
            String part1 = parts[0];
            String part2 = parts[1];
            int number = Integer.parseInt(part2);

            if(game.gameRules(card, new Card(number, part1, 0))) {
                tableLabel.append(b.getText() + " wurde gesetzt. \n");
                b.setVisible(false);
                card = new Card(number, part1, 0);
                rotatePlayer();
                //tableLabel.append(player.getName() + " ist an der Reihe. \n");

            } else {
                tableLabel.append("Diese Karte kann nicht gespielt werden. Wähle eine andere Karte aus. \n");
                tableLabel.append(card.getColor() + " " + card.getNumber() + " liegt auf dem Stapel. \n");
            }
        }
    }

}
