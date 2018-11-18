import java.util.ArrayList;

public abstract class Pile {
	private ArrayList<Card> cards;

	public Pile() {
		cards = new ArrayList<Card>();
	}

	public void addCard(Card card) {
		cards.add(card);
	}

	public boolean hasCard() {
		return cards.size() > 0;
	}

	public Card removeCard() {
		return cards.remove(cards.size() - 1);
	}

	private void swapCards(int index1, int index2) {
		Card temp = cards.get(index1);
		cards.set(index1, cards.get(index2));
		cards.set(index2, temp);
	}

	public void shuffle() {
		int numCards = cards.size();
		for (int i = numCards - 1; i > 1; i--) {
			int random = (int) (Math.random() * i);
			swapCards(i, random);
		}
	}

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