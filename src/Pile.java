

import java.util.ArrayList;
import java.util.List;

//must use a list, limit to use only list and iterator methods
//shuffling, sorting, removing/adding cards, searching, grouping...
public class Pile {
	private List<Card> cards;

	public Pile() {
		cards = new ArrayList<Card>();
	}
	
	public void addCard(Card card) {
		cards.add(card);
	}
	
	public Card removeCard() {
		return cards.remove(0);
	}
	
	public boolean hasCard() {
		return cards.size() > 0;
	}
	
	public void swapCards(int index1, int index2) {
		Card temp = cards.get(index1);
		cards.set(index1, cards.get(index2));
		cards.set(index2, temp);
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
