import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Deck deck = new Deck();

		System.out.println("Enter choice:\n");

		int a, b, choice = 1;
		while (choice == 1)
		{ choice = 0;
			System.out.println("\ta) createDeck\n"+"\tb) printDeck()\n"+"\tc) printCard()\n"+"\td) sameCard()\n"+"\te) compareCard()\n"+"\tf) findCard()\n"+"\tg) dealCard()\n"+"\th) shuffleDeck()\n");
			char x=sc.next().charAt(0);
			switch(x) {
			case 'a':
			case 'A':
				// a) createDeck()
				deck.createDeck();
				System.out.println("Deck Created!");
				break;
				case 'b':
				case 'B':
				//b) printDeck()
				deck.printDeck();
				break;
				case 'c':
				case 'C':
				//c) printCard()
				System.out.println("Printing a random Card.");
				deck.shuffleDeck();
				deck.printCard();
				break;
				case 'd':
				case 'D':
				// d) sameCard() //Card which is from same suit
				System.out.println("Enter any 2 positions to check if cards are from the same suit.");
				a = sc.nextInt();
				b = sc.nextInt();
				boolean same = deck.sameSuit(a, b);
				if (same) {
					System.out.println("\nBoth cards are from the same suit.");
				} else {
					System.out.println("\nBoth cards are not from the same suit.");
				}
				break;
				case 'e':
				case 'E':
				// e) compareCard() //Card having same rank or number
				System.out.println("\nEnter any 2 positions to check if cards have the same value.");
				a = sc.nextInt();
				b = sc.nextInt();
				boolean comp = deck.compareCard(a, b);
				if (comp) {
					System.out.println("\nBoth cards have same value.");
				} else {
					System.out.println("\nBoth cards don't have same value.");
				}
				break;
				case 'f':
				case 'F':
				// f) findCard() //Search for particular card
				System.out.println("Enter Suit of card to find:");
				String s = sc.next();
				System.out.println("Enter Value of card to find:");
				String v = sc.next();

				int pos = deck.findCard(s, v);
				if (pos == -1) {
					System.out.println("Card not found.");
				} else {
					System.out.println("Card has been found at " + pos);
				}

				break;
				case 'g':
				case 'G':
				// g) dealCard() //Print 5 random cards
				deck.dealCard();
				break;
				case 'h':
				case 'H':
				// h) shuffleDeck() //Randomize the deck
				deck.shuffleDeck();
				deck.printDeck();
				break;
				default:
				System.out.println("Wrong Input!\nPlease re-enter choice");
				x=sc.next().charAt(0);
				choice = 1;
				break;
			}
			System.out.println("Do you wish to continue? (0/1)");
			choice = sc.nextInt();
		}
	}
}