import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	ArrayList<Card> cards = new ArrayList<Card>();

	public void createDeck() {
		String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};

		for (String s : suits) {
			for (String v : values) {
				cards.add(new Card(s, v));
			}
		}
	}

	public void shuffleDeck() {
		System.out.println("\n________________Shuffling________________");
		Collections.shuffle(cards);
	}
	public void printCard() {
		for (Card card : cards) {
			System.out.println(card);
			return;
		}
	}
	public void printDeck() {
		for (Card card : cards) {
			System.out.println(card);
		}
	}
	//dealCard : randomly deal 5 cards
	public void dealCard() {
		System.out.println("\n________________Dealing 5 Rando Cards________________");
		shuffleDeck();
		for (int i = 0; i < 5; i++) {
			System.out.println(cards.get(i));
		}
	}

	//sameSuit : if card belongs to the same suit
	public boolean sameSuit(int x, int y){
        if ((cards.get(x)).getSuit().equals((cards.get(y)).getSuit())) {
            return true;
        }
		return false;
    }
	//compareCard : if card are the value
	public boolean compareCard(int x, int y){
		if ((cards.get(x)).getValue().equals((cards.get(y)).getValue())) {
			return true;
		}
		return false;
	}
	//findCard : user enters the suit and value, locate the position of the card
	public int findCard(String suit, String value){
		for (Card card : cards) {
			if ((card.getSuit().equals(suit)) && (card.getValue().equals(value))){
				return cards.indexOf(card);
			}
		}
		return -1;
	}
	//identifyCard : select random card and tell if it is face or number card
}