package P1;

public class Driver {
    public static void main(String[] args) {
        // create new instance of deck
        Deck deck = new Deck();
        numPicksLoop(deck);
    }

    public static int numPicks(Deck deck) {
        boolean spadeFound = false;
        boolean clubFound = false;
        boolean diamondFound = false;
        boolean heartFound = false;
        int numPicks = 0;
        // Handles looping over deck and picking cards
        for (int i = 0; i < deck.getSize(); i++) {
            if (deck.getCard(i).getSuit().equals("Spades") && !spadeFound) {
                spadeFound = true;
                System.out.println(deck.getCard(i).toString());
            }
            if (deck.getCard(i).getSuit().equals("Clubs") && !clubFound) {
                clubFound = true;
                System.out.println(deck.getCard(i).toString());
            }
            if (deck.getCard(i).getSuit().equals("Hearts") && !heartFound) {
                heartFound = true;
                System.out.println(deck.getCard(i).toString());
            }
            if (deck.getCard(i).getSuit().equals("Diamonds") && !diamondFound) {
                diamondFound = true;
                System.out.println(deck.getCard(i).toString());
            }
            if (spadeFound && clubFound && heartFound && diamondFound) {
                numPicks = i;
                System.out.println("Number of picks: " + numPicks + "\n");
                break;
            }
            // Handles putting card back in and reshuffling deck
            deck.shuffleDeck();
        }
        return numPicks;
    }

    public static void numPicksLoop(Deck deck) {
        int sum = 0;
        // Calling numPicks method 10000 times
        for (int i = 0; i < 10000; i++) {
            sum += numPicks(deck);
        }
        System.out.println("Average number of cards drawn before 4 cards found from different suits: " + (sum / 10000));
    }

}
