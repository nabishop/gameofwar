import java.util.*;

public class War {
   static Deck deck = new Deck();
   static Hand play1 = new Hand(deck.deal(26));
   static Hand play2 = new Hand(deck.deal(26));
   static ArrayList<Card> hand = new ArrayList<Card>();
   static int round = 0;

   public static void play(Card player1, Card player2) {
      if (player1.compareTo(player2) > 0) {
         play1.pickUp(hand);
         for (int x = 0; x < hand.size(); x++) {
            hand.remove(0);
            x--;
         }
         round++;
         System.out.println("-------Player 1 Won-------");
         System.out.println(
               "Player 1 (" + play1.getSize() + ")" + " played: " + player1);
         System.out.println(
               "Player 2 (" + play2.getSize() + ")" + " played: " + player2);
         System.out.println("--------------------------");
      } else if (player1.compareTo(player2) < 0) {
         play2.pickUp(hand);
         for (int x = 0; x < hand.size(); x++) {
            hand.remove(0);
            x--;
         }
         round++;
         System.out.println("-------Player 2 Won-------");
         System.out.println(
               "Player 1 (" + play1.getSize() + ")" + " played: " + player1);
         System.out.println(
               "Player 2 (" + play2.getSize() + ")" + " played: " + player2);
         System.out.println("--------------------------");
      } else {
         System.out.println("-----------Tie------------");
         System.out.println("Player 1 played: " + player1);
         System.out.println("Player 2 played: " + player2);
         if (play2.getSize() >= 4 && play1.getSize() >= 4) {
            System.out.println("Each player add 3 cards to hand!");
            for (int x = 0; x < 3; x++) {
               hand.add(play1.playTop());
               hand.add(play2.playTop());
            }
            Card fourth1 = play1.playTop();
            Card fourth2 = play2.playTop();
            hand.add(fourth1);
            hand.add(fourth2);
            play(fourth1, fourth2);
         }

      }
   }

   public static void main(String[] args) {
      System.out.println(play1);
      System.out.println(play2);
      while (play1.getSize() != 0 && play2.getSize() != 0 && round != 1000) {
         Card player1 = play1.playTop();
         Card player2 = play2.playTop();
         hand.add(player1);
         hand.add(player2);
         play(player1, player2);
      }
      if (play1.getSize() == 0) {
         System.out.println("\nPlayer 2 Won after " + round + " rounds!");
      } else if (play2.getSize() == 0) {
         System.out.println("Player 1 Won after " + round + " rounds!");
      } else {
         if (play1.getSize() > play2.getSize()) {
            System.out.println("Too many rounds!");
            System.out
                  .println("Player 1 won with " + play1.getSize() + " cards "
                        + "while Player 2 had " + play2.getSize() + " cards");

         } else {
            System.out
                  .println("Player 2 won with " + play2.getSize() + " cards "
                        + "while Player 1 had " + play1.getSize() + " cards");
         }
      }

   }
}
