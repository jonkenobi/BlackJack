package app;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Card> DeckList = new ArrayList<Card>();

    // Getter for full decklist;
    public ArrayList<Card> GetDeck() {
        return DeckList;
    }

    // Deals one random card from the deck
    public Card DealCard() {
        Card DealtCard = this.getRandomCard();
        DeckList.remove(DealtCard);
        return DealtCard;
    }

    // support function for DealHand()
    Card getRandomCard() {
        Random rand = new Random();
        int rfoo = rand.nextInt(DeckList.size());
        return DeckList.get(rfoo);
    }

    // initializes a full deck
    void InitDeck() {
        for (String suit : Card.Suits) {
            for (int i = 1; i <= 13; i++) {
                DeckList.add(new Card(suit, i));
            }
        }
    }
}
