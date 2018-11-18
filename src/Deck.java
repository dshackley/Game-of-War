public class Deck extends Pile {

	public final static int DECK_SIZE = 52;

	public Deck() {
		super();
		for (int i = 0; i < DECK_SIZE; i++) {
			Card card = new Card(i);
			addCard(card);
		}
		shuffle();
	}

	// deals card from deck and returns it
	// throw exception if stack is empty
	public void dealCard(Player player) {
		player.addCardToHand(super.removeCard());
	}

	public String toString() {
		return super.toString();
	}
}