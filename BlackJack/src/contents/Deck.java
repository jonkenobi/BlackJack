package contents;

import java.util.ArrayList;
import java.util.Random;

//////// Deck is a class. There is also
public class Deck {
	private ArrayList<Card> DeckList = new ArrayList<Card>();

	public ArrayList<Card> GetDeck() {
		// Getter for full decklist;
		return DeckList;
	}

	//
	public Card DealCard() {
		// Deals one random card from the deck
		Card DealtCard = this.getRandomCard();
		DeckList.remove(DealtCard);
		return DealtCard;
	}

	Card getRandomCard() {
		// support function for DealHand()
		Random rand = new Random();
		int rfoo = rand.nextInt(DeckList.size());
		return DeckList.get(rfoo);
	}

	void InitDeck() {
		// initializes a full deck
		for (String suit : Card.Suits) {
			for (int i = 1; i <= 13; i++) {
				DeckList.add(new Card(suit, i));
			}
		}
	}
}
