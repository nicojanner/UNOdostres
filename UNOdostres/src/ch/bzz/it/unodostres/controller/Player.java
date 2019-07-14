package ch.bzz.it.unodostres.controller;

import java.util.ArrayList;

/** 
 * Class represents a Player with the points, cards and name a player has.
 * @author Nadezha Maurer, Alen Redza
 * @version 1.0
*/
public class Player {

	private Player player;
	private String name;
	private int allPoints;
	private ArrayList<Card> cards = new ArrayList<Card>();
	private int endPoints;

	public Player(int points, String name) {
		setName(this.name);
		setPoints(this.allPoints);
	}

    /**
     * @return current player
     */
	public Player getPlayer() {
		return player;
	}

    /**
     * @param player to set the player
     */
	public void setPlayer(Player player) {
		this.player = player;
	}

    /**
     * @return current name of player
     */
	public String getName() {
		return name;
	}

    /**
     * @param name to set the name 
     */
	public void setName(String name) {
		this.name = name;
	}

    /**
     * @return all points of player 
     */
	public int getPoints() {
		return allPoints;
	}

    /**
     * @param points to set the points
     */
	public void setPoints(int points) {
		this.allPoints = points;
	}

    /**
     * Gets the points of the card and adds to card
     * @param card to set the card
     */
	public void setCard(Card card) {
		endPoints = card.getPoints();
		cards.add(card);
	}

    /**
     * Removes the card from the array list
     * @param card to remove the card
     */
	public void removeCard(Card card) {
		cards.remove(card);
		endPoints = endPoints - card.getPoints();
	}

    /**
     * @return ArrayList of cards
     */
	public ArrayList<Card> getCards() {
		return cards;
	}

}
