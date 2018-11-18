public class Player {

	private String name;
	private Hand hand;
	private int points;

	public Player(String name) {
		this.name = name;
		hand = new Hand();
		points = 0;
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
	
	public void addPoint() {
		points++;
	}
	
	public int getPoints() {
		return points;
	}
	
	public void printTurn() {
		System.out.println(name + "'s turn:");
	}
	
	public void printScore() {
		System.out.println(name + "'s points: " + points);
	}
	
	public String toString() {
		return name;
	}

}