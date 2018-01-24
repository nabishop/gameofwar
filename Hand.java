import java.util.*;

public class Hand {
   private ArrayList<Card> hand = new ArrayList<Card>();

   public Hand(ArrayList<Card> hand) {
      this.hand = hand;

   }

   public Card playTop() {
      Card top = hand.get(0);
      hand.remove(0);
      return top;
   }

   public void pickUp(ArrayList<Card> pick) {
      for (int x = 0; x < pick.size(); x++) {
         hand.add(pick.get(x));
      }
   }

   public int getSize() {
      return hand.size();
   }

   public String toString() {
      return hand.toString();
   }
}
