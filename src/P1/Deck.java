package P1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {
    private Card[] deck;
    // stores suits
    private static final String[] suits = {
            "Diamonds", "Clubs", "Spades", "Hearts"};
    private static final String[] faces = {
            "Ace", "King", "Queen", "Jack"};

    // Constructor
    public Deck() {
        deck = new Card[52];
        initialize();
        shuffleDeck();
    }

    public void initialize() {
        // Used for index storage
        int numCards = 0;
        // Nested for loop
        // Handles the suit
        for (int suit = 0; suit < 4; suit++) {
            // Handles the value of the suit
            for (int value = 2; value < 11; value++) {
                // stores the cards in the deck
                // creates a new card and attaches it to the deck. Handles 36 of the cards.
                deck[numCards++] = new Card(suits[suit], String.valueOf(value));
            }
            //
            for (int face = 0; face < 4; face++) {
                // adds last 16 face cards
                deck[numCards++] = new Card(suits[suit], faces[face]);
            }
        }
    }

    // method converts array to a list and shuffles said list
    public void shuffleDeck() {
        // Converts array to list
        List<Card> list = Arrays.asList(deck);
        // Shuffles list
        Collections.shuffle(list);
        // convert back to an array
        list.toArray(deck);
    }

    // getters
    public int getSize() {
        return deck.length;
    }

    public Card getCard(int index) {
        return deck[index];
    }
}
