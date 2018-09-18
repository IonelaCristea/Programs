/**
 * This class represents a simple implementation of a card game.
 * It displays on the screen a card with a random combination of suit and rank component.
 */


import java.util.Random;
/**
 * Date: 10.08.2018
 * @author Ionela Cristea
 * version 1.0
 */
public class CardGame {
	Random random =  new Random();
	//Declare a suit
	private String suit = "";
	//Declare a rank
	private int rank = 0;
	
	/* Constants for suits */
	private static final String CLUBS = "Clubs";
	private static final String DIAMONDS = "Diamonds";
	private static final String HEARTS = "Herats";
	private static final String SPADES = "Spades";
	
	/* Constants for rank*/
	private static final int ACE = 1;
	private static final int JACK = 11;
	private static final int QUEEN = 12;
	private static final int KING = 13;
	
	//Max number of ranks 
	private int maxNumbOfRanks = 4;
	//Max number of suits
	private int maxNumbOfSuit = 4;
	
	/**
	 * Retrieves a card with a rank and a suit value 
	 * @return a combination of a random rank and suit
	 */
	public String ExercicesCards() {
		this.suit = getSuit();
		this.rank = getRank();
		return rank + " " + suit;
	}
	/**
	 * Retrieves a rank component of the card
	 * @return A random rank
	 */
	public int getRank() {
		int randomRank = random.nextInt(maxNumbOfRanks) + 1;
		switch (randomRank) {
		case 1: return ACE;
		case 2: return JACK;
		case 3: return QUEEN;
		case 4: return KING;
		default: return (Integer) null; /* Can't occur but required by java */
		}
	}
	/**
	 * Retrieves the suit component of the card.
	 * @return A random suit
	 */
	public String getSuit() {
		int randomString = random.nextInt(maxNumbOfSuit) + 1;
		switch (randomString) {
		case 1: return (CLUBS);
		case 2: return (DIAMONDS);
		case 3: return (HEARTS);
		case 4: return (SPADES);
		default : return null;
		}
	}
	/**
	 * Creates a string representation of the card with random properties
	 * @return The complete name of the card 
	 */
	@Override
	public String toString() {
		return "Card: " + ExercicesCards() + ".";
	}
	
	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		CardGame cards =  new CardGame();
		System.out.println(cards.ExercicesCards() );
		
	}
}
