package ch.bzz.it.unodostres.controller;

import java.util.ArrayList;

public class Player {

	private Player player;
	private String name;
	private int points;
	private ArrayList<Card> cards = new ArrayList<Card>();

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public Player(int points, String name) {
		setName(this.name);
		setPoints(this.points);
	}
	
	public void setCard(Card card) {
		cards.add(card);
	}
	
}
