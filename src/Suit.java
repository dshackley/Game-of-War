/**
 *
 * @author Matt Iandoli
 */
public enum Suit implements Comparable<Suit> {

	CLUBS("Clubs", "♣"), DIAMONDS("Diamonds", "♦"), HEARTS("Hearts", "♥"), SPADES("Spades", "♠");

	private final String name;
	private final String graphic;

	/**
	 *
	 * @param name
	 * @param graphic
	 */
	private Suit(String name, String graphic) {
		this.name = name;
		this.graphic = graphic;
	}

	/**
	 *
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 *
	 * @return
	 */
	public String getGraphic() {
		return graphic;
	}

	/* (non-Javadoc)
	 * @see java.lang.Enum#toString()
	 */
	public String toString() {
		return graphic;
	}
}