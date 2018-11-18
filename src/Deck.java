

import java.util.List;

public class Deck extends Pile {

	public final static int DECK_SIZE = 52;

	public Deck() {
		super();
		for(int i = 1; i <= DECK_SIZE; i++) {
			Card card = new Card(i);
			super.addCard(card);
		}
		shuffle();
	}
	
	private void shuffle() {
		for (int i = DECK_SIZE - 1; i > 1; i--) {
			int random = (int) (Math.random() * i);
			super.swapCards(i, random);
		}
	}
	
	//deals card from deck and returns it
	//throw exception if stack is empty
	public void dealCard(Player player) {
		player.addCardToHand(super.removeCard());
	}
	
	public String toString() {
		return super.toString();
	}
}
