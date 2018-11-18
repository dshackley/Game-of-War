import java.util.Scanner;

public class War {

	// this is our card game version of war

	// Rules: there is a player and a computer vs eachother, the player has to hit
	// enter for the game to continue to the next turn

	// Each turn, a player uses a card in their hand and compares it to their
	// competitor, whichever player's card has the highest value wins

	// the round, if the cards are the same no one wins the round and no points are
	// given, whoever has the most points at the end wins the game,

	// the end of the game is reached when there are no cards left in the player's
	// hands

	public static void main(String[] args) {
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
			player1.printTurn();
			sc.nextLine();
			Card pCard = player1.playTurn();
			System.out.println(pCard + "\n");
			
			computer.printTurn();
			Card cCard = computer.playTurn();
			System.out.println("\n" + cCard + "\n");

			int compareValue = pCard.compareTo(cCard);
			if (compareValue > 0) {
				System.out.println(player1 + " wins this round");
				player1.addPoint();;
			} else if (compareValue < 0) {
				System.out.println(computer + " wins this round");
				computer.addPoint();;
			} else {
				System.out.println("It's a tie. No one wins this round");
			}
			player1.printScore();
			computer.printScore();
			System.out.println();
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
}