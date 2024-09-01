package ArrayList;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Dqueue1 {
  public static void main(String[] args) {
    Deque<String> str = new ArrayDeque<>();
    // str.addLast("neha");
    // str.addLast("priya");
    // str.addLast("me...");
    str.addFirst("chanchal");
    str.addFirst("nikita");
    str.addFirst("savita");

    System.out.println(str + " ");
    // str.push("sakshi");
    // str.push("ravina");
    // str.pop();
    // str.peekFirst();
    // str.peekLast();
    // System.out.println(str.element());
    System.out.println(str.getFirst());
    System.out.println(str.getLast());
    System.out.println(str.peekFirst());
    System.out.println(str.offerFirst("avni"));
    System.out.println(str.offerLast(" nikita"));
    // System.out.println(str.offerFirst(""));

    System.out.println(str);
    // System.out.println(str);
    // for (String str1 : str) {
    // System.out.println(str1);
    // }
  }
}
