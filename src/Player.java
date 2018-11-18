

//instance variables related to players, name, hand, score
public class Player {
	private Hand hand;
	private String name;

	public Player(String name) {
		this.name = name;
		hand = new Hand();
	}
	
	public void addCardToHand(Card card) {
		hand.addCard(card);
	}
	
	public Hand getHand() {
		return hand;
	}
	
	public Card playTurn() {
		return hand.removeCard();
	}
}
