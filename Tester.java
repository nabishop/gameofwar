
public class Tester {

   public static void main(String[] args) {
      Card a = new Card(1, 1);
      System.out.println(a);
      Card b = new Card(2, 8);
      System.out.println(b);
      System.out.println(a.compareTo(b) + "\n");
      Deck c = new Deck();
      System.out.println(c);
      System.out.println(c.deal(5));
   }

}
