package devmindJava.Curs7;

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    ArrayList<Cards> cards = new ArrayList<>();

    public void deckgen() {

        for (Cards.DeckSuit decksuit : Cards.DeckSuit.values()) {
            for (Cards.DeckLetter deckletter : Cards.DeckLetter.values()) {
                Cards cards1 = new Cards(decksuit, deckletter);
                cards.add(cards1);
               // System.out.println(deckletter + " of " + decksuit);
            }
        }
    }

    public void random() {
        Collections.shuffle(cards);
        Random rand = new Random();
        int randomNr = rand.nextInt(52);
        System.out.println("\n\tPick the lucky card : " + cards.get(randomNr).getDeckLetter() + " of " + cards.get(randomNr).getDeckSuit());
    }

    public void shuffle() {
        System.out.println("\nShuffle 12 cards:");
        Random randShuffle = new Random();
        int randShuffleNr = randShuffle.nextInt(52);

        for (int i = 1; i < 5; i++) {
            System.out.println("\nCartile jucatorului " + i + " sunt:");
            for (int j = 0; j < 4; j++) {
                System.out.println("\t" + cards.get(randShuffleNr).getDeckLetter() + " of " + cards.get(randShuffleNr).getDeckSuit());
                randShuffleNr--;
            }
        }
    }
}
