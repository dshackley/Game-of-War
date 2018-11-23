import java.util.ArrayList;

/**
 * Abstract class of a pile of cards
 * @author Matt Iandoli
 *
 */
public abstract class Pile {
	
	private ArrayList<Card> cards;

	/**
	 * Creates an empty pile of cards
	 */
	public Pile() {
		cards = new ArrayList<Card>();
	}

	/**
	 * Adds card to the top of the pile
	 * @param card The card to be added to the pile
	 */
	public void addCard(Card card) {
		cards.add(card);
	}

	/**
	 * Checks to see if the pile has any cards
	 * @return boolean if it has cards
	 */
	public boolean hasCard() {
		return cards.size() > 0;
	}
	
	/**
	 * Gets the number of cards in the pile
	 * @return size of pile
	 */
	public int getLength() {
		return cards.size();
	}
	
	/**
	 * Removes the top card from the pile
	 * @return the removed card
	 */
	public Card removeCard() {
		return cards.remove(cards.size() - 1);
	}
	
	/**
	 * Helper method: Swaps two cards in the pile
	 * @param index1 First card to swap
	 * @param index2 Second card
	 */
	private void swapCards(int index1, int index2) {
		Card temp = cards.get(index1);
		cards.set(index1, cards.get(index2));
		cards.set(index2, temp);
	}

	/**
	 * Shuffles the pile of cards
	 */
	public void shuffle() {
		int numCards = cards.size();
		for (int i = numCards - 1; i > 1; i--) {
			int random = (int) (Math.random() * i);
			swapCards(i, random);
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		String str = "";
		for (int i = 0; i < cards.size(); i++) {
			str += cards.get(i).toString();
			if (i != cards.size() - 1) {
				str += ", ";
			}
		}
		return str;
	}
}