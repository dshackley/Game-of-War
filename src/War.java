import java.util.Scanner;

public class War {

	//this is our card game version of war
	//Rules: there is a player and a computer vs eachother, the player has to hit enter for the game to continue to the next turn
	//Each turn, a player uses a card in their hand and compares it to their competitor, whichever player's card has the highest value wins
	//the round, if the cards are the same no one wins the round and no points are given, whoever has the most points at the end wins the game,
	//the end of the game is reached when there are no cards left in the player's hands
	
	public static void main(String[] args) {
		Player player1 = new Player("Player 1");
		Player computerPlayer = new Player("Computer Player");
		Deck deck = new Deck();
		int playerPoints = 0;
		int computerPoints = 0;
		
		boolean bolFirst = true;
		while (deck.hasCard()) {
			if (bolFirst) {
				deck.dealCard(player1);
			} else {
				deck.dealCard(computerPlayer);
			}
			bolFirst = !bolFirst;
		}
		
		System.out.println("Player 1: " + player1.getHand());
		System.out.println("Computer: " + computerPlayer.getHand());
		
		System.out.println("Player 1's turn");
		Scanner sc = new Scanner(System.in);
		while(player1.getHand().hasCard()) {
			sc.nextLine();
			Card pCard = player1.playTurn();
			Card cCard = computerPlayer.playTurn();
			System.out.println("Player 1's card: " + pCard);
			System.out.println("Computer's card: " + cCard);
			int compareValue = pCard.compareTo(cCard);
			if (compareValue > 0 ) {
				System.out.println("Player 1 wins this round");
				playerPoints++;
			}
			else if (compareValue < 0) {
				System.out.println("Computer wins this round");
				computerPoints++;
			}
			else {
				System.out.println("It's a tie. No one wins this round");
			}
			System.out.println("Player 1's score: " + playerPoints);
			System.out.println("Computer's score: " + computerPoints);
		}
		sc.close();
		System.out.println("\nGame Over");
		if (playerPoints > computerPoints) {
			System.out.println("Player 1 won!");
		}
		else if (computerPoints > playerPoints) {
			System.out.println("Computer won!");
		}
		else {
			System.out.println("It's a tie!");
		}
		
	}

}
