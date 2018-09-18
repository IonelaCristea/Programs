package lessons;

import java.util.Random;

/**
 * Date: 28.07.2018
 * @author Ionela Crsitea
 * @version 1.0.
 *
 */

/**
 * This class represents a simple implementation of a Card Game.
 * The chosen card of the game is random, and determinate by getCard() method,
 * and the suit by getShape() method.
 */
public class CardGame {
	Random random =  new Random();
	/* stores a random number that represents a card */
	private int randomCard;
	/* stores a random number that represents a card shape */
	private int randomShape;
	/** Stores the maxim value for the random number */
	int max;
	
	public static void main(String[] args) {
		CardGame ecg = new CardGame();
		System.out.println(ecg.getCard() + " of " + ecg.getShape());

	}
/**
 * Create a Card Game object,
 * which sets random values between min and max, of both cards and suit
 */
	public CardGame() {
		this.max = 13;
		randomCard = random.nextInt(max) + 1;
		this.max = 4;
		randomShape = random.nextInt(max) + 1;
		
	}
	
	/**
	 * Returns a random card of the game.
	 * @return A cards of the game (Ace, 2, 3 etc.).
	 */
	public String getCard() {
		switch (randomCard) {
		case 1: return "Ace";
		case 2: return "2";
		case 3: return "3";
		case 4: return "4";
		case 5: return "5";
		case 6: return "6";
		case 7: return "7";
		case 8: return "8";
		case 9: return "9";
		case 10: return "10";
		case 11: return "Jack";
		case 12: return "Queen";
		case 13: return "King";
		default: return null; /* Can't occur but is required by Java */
		}	
	}
	/**
	 * Returns a random shape of the card.
	 * @return A shape of the card (Club, Diamonds, Hearts or Spades).
	 */
	public String getShape() {
		switch (randomShape) {
		case 1: return "Clubs";
		case 2: return "Diamonds";
		case 3: return "Hearts";
		case 4: return "Spades";
		default: return null; /* Can't occur but is required by Java */
		}
	}
}

