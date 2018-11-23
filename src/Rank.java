/**
 *
 * @author Matt Iandoli
 */
public enum Rank {
	
	TWO("2", 2), THREE("3", 3), FOUR("4", 4), FIVE("5", 5), SIX("6", 6), SEVEN("7", 7), EIGHT("8", 8), NINE("9",
			9), TEN("10", 10), JACK("J", 11), QUEEN("Q", 12), KING("K", 13), ACE("A", 14);

	private final String graphic;
	private final int value;

	/**
	 *
	 * @param graphic
	 * @param value
	 */
	private Rank(String graphic, int value) {
		this.graphic = graphic;
		this.value = value;
	}

	/**
	 *
	 * @return
	 */
	public String getGraphic() {
		return graphic;
	}

	/**
	 *
	 * @return
	 */
	public int getValue() {
		return value;
	}

	/* (non-Javadoc)
	 * @see java.lang.Enum#toString()
	 */
	public String toString() {
		return graphic;
	}
}