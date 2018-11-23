import java.util.Scanner;

/**
 *
 * @author Danielle Shackley
 */
public class War {
	
	private static final int TIE_LENGTH = 3 + 1;

	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hit \"Enter\" to play a round");
		Player player1 = new Player("Player 1");
		Player computer = new Player("Computer");
		Deck deck = new Deck();

		boolean bolFirst = true;
		while (deck.hasCard()) {
			if (bolFirst) {
				deck.dealCard(player1);
			} else {
				deck.dealCard(computer);
			}
			bolFirst = !bolFirst;
		}

		Scanner sc = new Scanner(System.in);
		while (player1.getHand().hasCard()) {
			playRound(2, player1, computer, sc);
		}
		sc.close();

		System.out.println("\nGame Over");
		int pScore = player1.getPoints();
		int cScore = computer.getPoints();
		if (pScore > cScore) {
			System.out.println(player1 + " won!");
		} else if (pScore < cScore) {
			System.out.println(computer + " won!");
		} else {
			System.out.println("It's a tie!");
		}
	}
	
	/**
	 *
	 * @param worth
	 * @param player1
	 * @param player2
	 * @param sc
	 */
	private static void playRound(int worth, Player player1, Player player2, Scanner sc) {
		player1.printTurn();
		sc.nextLine();
		Card card1 = player1.playTurn();
		System.out.println(card1 + "\n");
		
		player2.printTurn();
		Card card2 = player2.playTurn();
		System.out.println("\n" + card2 + "\n");

		int compareValue = card1.compareTo(card2);
		if (compareValue > 0) {
			System.out.println(player1 + " wins this round");
			player1.addPoint(worth);
		} else if (compareValue < 0) {
			System.out.println(player2 + " wins this round");
			player2.addPoint(worth);
		} else {
			playTie(worth, player1, player2, sc);
		}
		player1.printScore();
		player2.printScore();
		System.out.println();
	}

	/**
	 *
	 * @param worth
	 * @param player1
	 * @param player2
	 * @param sc
	 */
	private static void playTie(int worth, Player player1, Player player2, Scanner sc) {
		System.out.println("Its a tie! Press \"Enter\" to play out the tie.");
		sc.nextLine();
		int numCards = player1.getHand().getLength();
		int count = numCards > TIE_LENGTH ? TIE_LENGTH : numCards;
		String blanks = "";
		for (int i = 0; i < count - 1; i++) {
			player1.playTurn();
			player2.playTurn();
			blanks += "■ ";
		}
		player1.printTurn();
		System.out.println("\n" + blanks + "\n");
		player2.printTurn();
		System.out.println("\n" + blanks + "\n");
		playRound(worth + 2 * count, player1, player2, sc);
	}
}