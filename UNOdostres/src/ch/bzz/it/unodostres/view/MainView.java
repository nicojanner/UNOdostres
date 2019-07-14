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

    private JLabel playerName1 = new JLabel();
    private JLabel playerName2 = new JLabel();
    private JLabel playerName3 = new JLabel();
    private JLabel playerName4 = new JLabel();
    private JTextArea gameTxtArea = new JTextArea();

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

    private JButton pull1Btn = new JButton("Ziehen");
    private JButton pull2Btn = new JButton("Ziehen");
    private JButton pull3Btn = new JButton("Ziehen");
    private JButton pull4Btn = new JButton("Ziehen");

    private ArrayList<Card> cards1;
    private ArrayList<Card> cards2;
    private ArrayList<Card> cards3;
    private ArrayList<Card> cards4;
    private ArrayList<Card> stack;
    private Card card;
    private Card pulledCard;
    private Game game = new Game(this);

    private int counter1 = 0;
    private int counter2 = 0;
    private int counter3 = 0;
    private int counter4 = 0;

    private Player player1;
    private Player player2;
    private Player player3;
    private Player player4;


    public MainView(Player player1, Player player2, Player player3, Player player4, ArrayList<Card> stack) {
        this.player1 = player1;
        this.player2 = player2;
        this.player3 = player3;
        this.player4 = player4;
        this.stack = stack;
        ClickListener cl = new ClickListener();
        setTitle("UNOdostres");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(1000, 500);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
        setLocation(x, y);
        player1CardPanel.setLayout(new FlowLayout());
        player2CardPanel.setLayout(new BoxLayout(player2CardPanel, BoxLayout.Y_AXIS));
        player3CardPanel.setLayout(new FlowLayout());
        player4CardPanel.setLayout(new BoxLayout(player4CardPanel, BoxLayout.Y_AXIS));
        cards1 = player1.getCards();
        cards2 = player2.getCards();
        cards3 = player3.getCards();
        cards4 = player4.getCards();
        gameTxtArea.setBackground(Color.white);
        gameTxtArea.setBorder(BorderFactory.createLineBorder(Color.black));
        gameTxtArea.setWrapStyleWord(true);
        gameTxtArea.setEditable(false);
        card = stack.get(1);
        stack.remove(1);
        gameTxtArea.append(card.getColor() + " " + card.getNumber() + " liegt auf dem Stapel. \n");
        gameTxtArea.append(player1.getName() + " ist an der Reihe. \n");
        JScrollPane scroll = new JScrollPane(gameTxtArea,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.setPreferredSize(new Dimension(100,50));

        pull1Btn.setBackground(Color.black);
        pull2Btn.setBackground(Color.black);
        pull3Btn.setBackground(Color.black);
        pull4Btn.setBackground(Color.black);
        pull1Btn.setForeground(Color.white);
        pull2Btn.setForeground(Color.white);
        pull3Btn.setForeground(Color.white);
        pull4Btn.setForeground(Color.white);

        pull1Btn.addActionListener(new ClickListener() {
            public void actionPerformed(ActionEvent e) {
                pulledCard = stack.get(1);
                stack.remove(1);
                JButton btn = new JButton(pulledCard.getColor() + " " + pulledCard.getNumber());
                switch (pulledCard.getColor()) {
                    case "red":
                        btn.setBackground(Color.red);
                        break;
                    case "yellow":
                        btn.setBackground(Color.yellow);
                        break;
                    case "green":
                        btn.setBackground(Color.green);
                        break;
                    case "blue":
                        btn.setBackground(Color.blue);
                        break;
                }
                btn.setForeground(Color.black);
                counter1++;
                btn.addActionListener(cl);
                player1CardPanel.add(btn);
                player1CardPanel.revalidate();
                player1CardPanel.repaint();
            }
        });
        pull2Btn.addActionListener(new ClickListener() {
            public void actionPerformed(ActionEvent e) {
                pulledCard = stack.get(1);
                stack.remove(1);
                JButton btn = new JButton(pulledCard.getColor() + " " + pulledCard.getNumber());
                switch (pulledCard.getColor()) {
                    case "red":
                        btn.setBackground(Color.red);
                        break;
                    case "yellow":
                        btn.setBackground(Color.yellow);
                        break;
                    case "green":
                        btn.setBackground(Color.green);
                        break;
                    case "blue":
                        btn.setBackground(Color.blue);
                        break;
                }
                btn.setForeground(Color.black);
                btn.addActionListener(cl);
                counter2++;
                player2CardPanel.add(btn);
                player2CardPanel.revalidate();
                player2CardPanel.repaint();
            }
        });
        pull3Btn.addActionListener(new ClickListener() {
            public void actionPerformed(ActionEvent e) {
                pulledCard = stack.get(1);
                stack.remove(1);
                JButton btn = new JButton(pulledCard.getColor() + " " + pulledCard.getNumber());
                switch (pulledCard.getColor()) {
                    case "red":
                        btn.setBackground(Color.red);
                        break;
                    case "yellow":
                        btn.setBackground(Color.yellow);
                        break;
                    case "green":
                        btn.setBackground(Color.green);
                        break;
                    case "blue":
                        btn.setBackground(Color.blue);
                        break;
                }
                btn.setForeground(Color.black);
                btn.addActionListener(cl);
                counter3++;
                player3CardPanel.add(btn);
                player3CardPanel.revalidate();
                player3CardPanel.repaint();
            }
        });
        pull4Btn.addActionListener(new ClickListener() {
            public void actionPerformed(ActionEvent e) {
                pulledCard = stack.get(1);
                stack.remove(1);
                JButton btn = new JButton(pulledCard.getColor() + " " + pulledCard.getNumber());
                switch (pulledCard.getColor()) {
                    case "red":
                        btn.setBackground(Color.red);
                        break;
                    case "yellow":
                        btn.setBackground(Color.yellow);
                        break;
                    case "green":
                        btn.setBackground(Color.green);
                        break;
                    case "blue":
                        btn.setBackground(Color.blue);
                        break;
                }
                btn.setForeground(Color.black);
                btn.addActionListener(cl);
                counter4++;
                player4CardPanel.add(btn);
                player4CardPanel.revalidate();
                player4CardPanel.repaint();
            }
        });
        player1CardPanel.add(pull1Btn);
        player2CardPanel.add(pull2Btn);
        player3CardPanel.add(pull3Btn);
        player4CardPanel.add(pull4Btn);

        for (int i = 0; i < cards1.size(); i++) {
            JButton btn = new JButton(cards1.get(i).getColor() + " " + cards1.get(i).getNumber());
            switch (cards1.get(i).getColor()) {
                case "red":
                    btn.setBackground(Color.red);
                    break;
                case "yellow":
                    btn.setBackground(Color.yellow);
                    break;
                case "green":
                    btn.setBackground(Color.green);
                    break;
                case "blue":
                    btn.setBackground(Color.blue);
                    break;
            }
            btn.setForeground(Color.black);
            btn.addActionListener(cl);
            counter1++;
            player1CardPanel.add(btn);
        }
        for (int i = 0; i < cards2.size(); i++) {
            JButton btn = new JButton(cards2.get(i).getColor() + " " + cards2.get(i).getNumber());
            switch (cards2.get(i).getColor()) {
                case "red":
                    btn.setBackground(Color.red);
                    break;
                case "yellow":
                    btn.setBackground(Color.yellow);
                    break;
                case "green":
                    btn.setBackground(Color.green);
                    break;
                case "blue":
                    btn.setBackground(Color.blue);
                    break;
            }
            btn.setForeground(Color.black);
            btn.addActionListener(cl);
            counter2++;
            player2CardPanel.add(btn);
        }
        for (int i = 0; i < cards3.size(); i++) {
            JButton btn = new JButton(cards3.get(i).getColor() + " " + cards3.get(i).getNumber());
            switch (cards3.get(i).getColor()) {
                case "red":
                    btn.setBackground(Color.red);
                    break;
                case "yellow":
                    btn.setBackground(Color.yellow);
                    break;
                case "green":
                    btn.setBackground(Color.green);
                    break;
                case "blue":
                    btn.setBackground(Color.blue);
                    break;
            }
            btn.setForeground(Color.black);
            btn.addActionListener(cl);
            counter3++;
            player3CardPanel.add(btn);
        }
        for (int i = 0; i < cards4.size(); i++) {
            JButton btn = new JButton(cards4.get(i).getColor() + " " + cards4.get(i).getNumber());
            switch (cards4.get(i).getColor()) {
                case "red":
                    btn.setBackground(Color.red);
                    break;
                case "yellow":
                    btn.setBackground(Color.yellow);
                    break;
                case "blue":
                    btn.setBackground(Color.blue);
                    break;
                case "green":
                    btn.setBackground(Color.green);
                    break;
            }
            btn.setForeground(Color.black);
            btn.addActionListener(cl);
            counter4++;
            player4CardPanel.add(btn);
        }
        gamePanel.setLayout(new BorderLayout(30, 30));

        playerName1.setHorizontalAlignment(JLabel.CENTER);
        playerName3.setHorizontalAlignment(JLabel.CENTER);

        playerName1.setText(player1.getName());
        playerName2.setText(player2.getName());
        playerName3.setText(player3.getName());
        playerName4.setText(player4.getName());


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

    private class ClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Object o = e.getSource();
            JButton b = (JButton) o;
            String s = b.getText();
            String[] parts = s.split(" ");
            String part1 = parts[0];
            String part2 = parts[1];
            int number = Integer.parseInt(part2);

            if (game.gameRules(card, new Card(number, part1, 0))) {
                gameTxtArea.append(b.getText() + " wurde gesetzt.\n");
                b.setVisible(false);
                card = new Card(number, part1, 0);
                if (b.getParent() == player1CardPanel) {
                    counter1--;
                } else if (b.getParent() == player2CardPanel) {
                    counter2--;
                } else if (b.getParent() == player3CardPanel) {
                    counter3--;
                } else if (b.getParent() == player4CardPanel) {
                    counter4--;
                }
                if(counter1 == 0) {
                    dispose();
                    String name = player1.getName();
                    new EndView(player1, player2, player3, player4, stack, name);
                } else if(counter2 == 0) {
                    dispose();
                    String name = player2.getName();
                    new EndView(player1, player2, player3, player4, stack, name);
                } else if(counter3 == 0) {
                    dispose();
                    String name = player3.getName();
                    new EndView(player1, player2, player3, player4, stack, name);
                } else if(counter4 == 0) {
                    dispose();
                    String name = player4.getName();
                    new EndView(player1, player2, player3, player4, stack, name);
                } else {
                    gameTxtArea.append("Nächster Spieler ist an der Reihe.\n");
                }
            } else {
                gameTxtArea.append("Diese Karte kann nicht gespielt werden. Wähle eine andere Karte aus.\n");
                gameTxtArea.append(card.getColor() + " " + card.getNumber() + " liegt auf dem Stapel.\n");
            }

        }
    }
}
