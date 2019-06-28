package ch.bzz.it.unodostres.controller;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;

public class Card {

	private Card card;
	private int points;
	private int number;
	private String color;

	public Card(int number, String col) {

		this.number = number;
		this.color = col;
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
