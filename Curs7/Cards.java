package devmindJava.Curs7;

public class Cards {


    private final DeckLetter deckletter;
    private final DeckSuit decksuit;

    public enum DeckSuit{
        clubs,diamonds,hearts,spades//litere mari
    }

    public enum DeckLetter{
        Deuces,Three,Four,Five,Six,Seven,Eight,Nine,Ten,Jack,Queen,King,Ace//litere mari
    }
    public DeckLetter getDeckLetter() {
        return deckletter;
    }

    public DeckSuit getDeckSuit() {
        return decksuit;
    }

    public Cards(DeckSuit decksuit,DeckLetter deckletter){
        this.decksuit = decksuit;
        this.deckletter = deckletter;
    }

    public static void main (String[] args){


    }
}
