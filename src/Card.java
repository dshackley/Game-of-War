/**
 * 
 * @author Danielle Shackley
 */
public class Card implements Comparable<Card> {

	private final static int SUIT_SIZE = 13;
	private Rank rank;
	private Suit suit;

	
	/**
	 * 
	 * @param value
	 */
	public Card(int value) {
		Rank[] ranks = { Rank.ACE, Rank.TWO, Rank.THREE, Rank.FOUR, Rank.FIVE, Rank.SIX, Rank.SEVEN, Rank.EIGHT,
				Rank.NINE, Rank.TEN, Rank.JACK, Rank.QUEEN, Rank.KING };
		Suit[] suits = { Suit.CLUBS, Suit.DIAMONDS, Suit.HEARTS, Suit.SPADES };
		rank = ranks[value % SUIT_SIZE];
		suit = suits[value / SUIT_SIZE];
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compareTo(Card o) {
		return this.rank.getValue() - o.rank.getValue();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return rank.getGraphic() + suit.getGraphic();
	}
}