package ch.bzz.it.unodostres.controller;

import java.util.ArrayList;
import java.util.Collections;

import ch.bzz.it.unodostres.view.MainView;
import ch.bzz.it.unodostres.view.StartView;

/** 
 * Includes the game logic 
 * @author Nadezha Maurer, Alen Redza
 * @version 1.0
*/
public class Game {

	ArrayList<Card> stack = new ArrayList<Card>();
	Player player1 = new Player(0, "name");
	Player player2 = new Player(0, "name");
	Player player3 = new Player(0, "name");
	Player player4 = new Player(0, "name");

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

	/**
	 * This method shuffles the deck with the function shuffle from the Collections
	 * class
	 */
	public void shuffle() {
		Collections.shuffle(stack);
	}

	/**
	 * Method to get the first card of the deck
	 * 
	 * @return the first card of the deck
	 */
	public Card getFirstCard() {
		return stack.remove(stack.size() - 1);
	}

	/**
	 * Method to deal 6 cards to each player with the previous method getFirstCard()
	 */
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

	/**
	 * This method creates a new deck with two arrays of colors and numbers
	 */
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

	/**
	 * Checks if the card is allowed to be placed
	 *
	 * @param  card that the previous player laid
	 * @param  card that is going to be laid
	 * @return      if it is allowed to lay the card or not
	 */
	public boolean gameRules(Card laidCard, Card newCard) {
		if ((laidCard.getColor().equals(newCard.getColor())) || (laidCard.getNumber() == newCard.getNumber())) {
			return true;
		} else {
			return false;
		}
	}
}
