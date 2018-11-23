/**
 * Class that represents a player in the game
 * @author Matt Iandoli
 */
public class Player {

	private String name;
	private Hand hand;
	private int points;

	/**
	 * Creates a new player with a name and an empty hand
	 * @param name The name to be displayed
	 */
	public Player(String name) {
		this.name = name;
		hand = new Hand();
		points = 0;
	}

	/**
	 * Adds the given card to the hand
	 * @param card The card to be added to the hand
	 */
	public void addCardToHand(Card card) {
		hand.addCard(card);
	}

	/**
	 * Gets the player's hand
	 * @return the object containing the hand
	 */
	public Hand getHand() {
		return hand;
	}

	/**
	 * Plays out one turn for the player
	 * @return The card at the top of the player's hand
	 */
	public Card playTurn() {
		return hand.removeCard();
	}

	/**
	 * Adds the number of points to the player's total points
	 * @param numPoints
	 */
	public void addPoint(int numPoints) {
		points += numPoints;
	}
	
	/**
	 * Gets the current number of points for player
	 * @return the player's points
	 */
	public int getPoints() {
		return points;
	}
	
	/**
	 * Prints out the display for the player's turn
	 */
	public void printTurn() {
		System.out.println(name + "'s turn:");
	}
	
	/**
	 * Prints out the score of the player
	 */
	public void printScore() {
		System.out.println(name + "'s points: " + points);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return name;
	}

}