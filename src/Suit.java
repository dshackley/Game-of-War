public enum Suit implements Comparable<Suit> {

	CLUBS("Clubs", "♣"), DIAMONDS("Diamonds", "♦"), HEARTS("Hearts", "♥"), SPADES("Spades", "♠");

	private final String name;
	private final String graphic;

	private Suit(String name, String graphic) {
		this.name = name;
		this.graphic = graphic;
	}

	public String getName() {
		return name;
	}

	public String getGraphic() {
		return graphic;
	}

	public String toString() {
		return graphic;
	}
}