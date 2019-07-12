package ch.bzz.it.unodostres.controller;

import ch.bzz.it.unodostres.view.MainView;
import ch.bzz.it.unodostres.view.StartView;

import java.util.ArrayList;
import java.util.Collections;

public class Game {

	private Card playedCard;

	ArrayList<Card> stack = new ArrayList<Card>();
	Player player1 = new Player(0, "name");
	Player player2 = new Player(0, "name");
	Player player3 = new Player(0, "name");
	Player player4 = new Player(0, "name");
	Card card = null;

	public static void main(String[] args) {
		new Game();
	}

	public Game() {
		createStack();
		shuffle();
		dealCards();
		new StartView(player1, player2, player3, player4, stack);
	}

	public Game(MainView main) {

	}

	public void shuffle() {
		Collections.shuffle(stack);
	}

	public Card getFirstCard() {
		return stack.remove(stack.size() - 1);
	}

	public void dealCards() {
		int numberOfCards = 6;
		for (int i = 0; i < numberOfCards; i++) {
			player1.setCard(getFirstCard());
			player2.setCard(getFirstCard());
			player3.setCard(getFirstCard());
			player4.setCard(getFirstCard());
		}
	}

	private boolean playerWon() {
		if (player1.getPoints() >= 500 || player2.getPoints() >= 500 || player3.getPoints() >= 500
				|| player4.getPoints() >= 500) {
			return true;
		} else {
			return false;
		}
	}

	private void createStack() {
		String[] colors = { "red", "yellow", "green", "blue" };
		int[] numbers = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 0 };



		for (String color : colors) {
			for (int i = 0; i < numbers.length; i++) {
				int points = numbers[i];
				stack.add(new Card(numbers[i], color, points));
			}
		}

	}

	public boolean gameRules(Card laidCard, Card newCard) {
		if ((laidCard.getColor().equals(newCard.getColor())) || (laidCard.getNumber() == newCard.getNumber())) {
			return true;
		} else {
			return false;
		}
	}
}
