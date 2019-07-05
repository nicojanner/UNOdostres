package ch.bzz.it.unodostres.controller;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;

public class Card {

	private Card card;
	private int points;
	private int number;
	private String color;
	private String type;

	
	public Card(int number, String col, int points) {

		this.number = number;
		this.color = col;
		this.points = points;
	}
	
	public Card(String type, String col, int points) {

		this.type = type;
		this.color = col;
		this.points = points;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}
	

}
