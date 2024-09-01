package ArrayList;

import java.util.LinkedList;
import java.util.Queue;

public class queue1 {
    public static void main(String[] args) {
        Queue<String> q1 = new LinkedList<>();
        q1.add("sakshi");
        q1.add("pooja");
        q1.add("ravina");
        q1.add("priya");
        System.out.println(q1.poll());
        System.out.println(q1.peek());// and null provide no value in the array
        System.out.println(q1.contains("pooja"));
        System.out.println(q1.element());// show the exception no value in this list
        System.out.println(q1.offer("sonam ma'am"));
        System.out.println(q1.hashCode());
        System.out.println(q1.size());
        System.out.println(q1.toString());

        System.out.println(q1);
    }
}
