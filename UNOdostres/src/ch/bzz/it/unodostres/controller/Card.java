package ch.bzz.it.unodostres.controller;

/** 
 * Class represents a Card with the points, color and number.
 * @author Nadezha Maurer, Alen Redza
 * @version 1.0
*/
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

    /**
     * @return current points
     */
    public int getPoints() {
        return points;
    }

    /**
     * @param points to set the points
     */
    public void setPoints(int points) {
        this.points = points;
    }

    /**
     * @return current card
     */
    public Card getCard() {
        return card;
    }

    /**
     * @param card to set the card
     */
    public void setCard(Card card) {
        this.card = card;
    }

    /**
     * @return current number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @return current color
     */
    public String getColor() {
        return color;
    }

    /**
     * @return current type
     */
    public String getType() {
        return type;
    }
}
