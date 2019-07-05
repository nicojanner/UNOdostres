package ch.bzz.it.unodostres.controller;

import java.util.ArrayList;

public class Player {

	private Player player;
	private String name;
	private int allPoints;
	private ArrayList<Card> cards = new ArrayList<Card>();
	private int endPoints;

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
		return allPoints;
	}

	public void setPoints(int points) {
		this.allPoints = points;
	}

	public Player(int points, String name) {
		setName(this.name);
		setPoints(this.allPoints);
	}
	
	public void setCard(Card card) {
		endPoints = card.getPoints();
		cards.add(card);
	}
	
	public void removeCard(Card card) {
		cards.remove(card);
		endPoints = endPoints - card.getPoints();
	}
	
}
