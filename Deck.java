import java.util.*;

public class Deck {
   private ArrayList<Card> cards = new ArrayList<Card>();

   public Deck() {
      for (int s = 0; s < 4; s++) {
         for (int r = 0; r < 13; r++) {
            Card c = new Card(s, r);
            cards.add(c);
         }
      }
   }

   public String toString() {
      return cards.toString();
   }

   public ArrayList<Card> deal(int num) {
      ArrayList<Card> newList = new ArrayList<Card>();
      for (int x = 0; x < num; x++) {
         int numm = (int) (Math.random() * cards.size());
         newList.add(cards.get(numm));
         cards.remove(numm);
      }
      return newList;

   }

}
