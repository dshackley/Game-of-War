

//instance variables should be final
public class Card implements Comparable<Card> {

	private final static int SUIT_SIZE = 13;
	private Rank rank;
	private Suit suit;

	public Card(int index) {
	    int rankVal = index % SUIT_SIZE;
		int suitVal = index / SUIT_SIZE;
		
		switch(rankVal) {
		case 1:
			rank = Rank.ACE;
			break;
		case 2:
			rank = Rank.TWO;
			break;
		case 3:
			rank = Rank.THREE;
			break;
		case 4:
			rank = Rank.FOUR;
			break;
		case 5:
			rank = Rank.FIVE;
			break;
		case 6:
			rank = Rank.SIX;
			break;
		case 7:
			rank = Rank.SEVEN;
			break;
		case 8:
			rank = Rank.EIGHT;
			break;
		case 9:
			rank = Rank.NINE;
			break;
		case 10:
			rank = Rank.TEN;
			break;
		case 11:
			rank = Rank.JACK;
			break;
		case 12:
			rank = Rank.QUEEN;
			break;
		default:
			rank = Rank.KING;
			break;
		}
		
		switch(suitVal) {
		case 1:
			suit = Suit.CLUBS;
			break;
		case 2:
			suit = Suit.DIAMONDS;
			break;
		case 3:
			suit = Suit.HEARTS;
			break;
		default:
			suit = Suit.SPADES;
			break;
		}
	}	

	//implement Comparable, override equals() method
	public int compareTo(Card o) {
		return this.rank.getAltPriority() - o.rank.getAltPriority();
	}

	public String toString() {	
		return rank.getGraphic() + suit.getGraphic();
	}
}
