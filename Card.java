import java.util.*;

public class Card implements Comparable<Card> {
    final static String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    final static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"};
    private int suit;
    private int rank;

    public Card(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public int getSuit() {
        return suit;
    }

    public int compareTo(Card differentCard) {
        return this.getRank() - differentCard.getRank();
    }

    public String toString() {
        return ranks[rank] + " of " + suits[suit];
    }

}