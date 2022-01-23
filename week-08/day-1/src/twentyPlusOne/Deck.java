package twentyPlusOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        int i = 0;
        for (Suit s : Suit.values()) {
            for (Rank r : Rank.values()) {
                cards.add(new Card(r, s));
                i++;
            }
        }

    }

    public void shuffleDeck() {
        Collections.shuffle(cards);
    }

    public Card pullFirst() {
        Card result = cards.get(0);
        cards.remove(0);
        return result;
    }

    public Card pullLast() {
        Card result = cards.get(cards.size() - 1);
        cards.remove(cards.size() - 1);
        return result;
    }

    public Card pullRandom() {
        int randomIndex = (int) (Math.random() * 52);
        Card result = cards.get(randomIndex);
        cards.remove(randomIndex);
        return result;
    }
}
