package ch.bzz.it.unodostres.controller;

import java.util.ArrayList;
import java.util.Collections;

public class Game {

	ArrayList<Card> stack = new ArrayList<Card>();
	
	public static void main(String[] args) {
		
	}

	public Game() {



		String[] colors = { "red", "yellow", "green", "blue" };
		String[] color_actionCard = {"black"};
		int[] numbers = { 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9 };
		int[] actionCards = { 2, 2, 4, 4 };

		for (String color : color_actionCard) {
			for (int i = 0; i < actionCards.length; i++) {
				stack.add(new Card(numbers[i], color));
			}
		}
		
		for (String color : colors) {
			for (int i = 0; i < numbers.length; i++) {
				stack.add(new Card(numbers[i], color));
			}
		}		

	}
	
	public void shuffle() {
		Collections.shuffle(stack);
	}

//	public static void main(String[] args) {
//		
//	}

}
