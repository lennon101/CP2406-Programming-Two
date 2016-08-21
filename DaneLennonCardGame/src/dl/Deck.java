package dl;

import java.util.Vector;

/**
 * Created by xander on 19/08/2016.
 */
public interface Deck {
    void add(Card c);

    Vector<Card> cards();

    void remove(Card c);

    void shuffle();
}
