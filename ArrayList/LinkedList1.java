package ArrayList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> str1 = new LinkedList<>();
        // LinkedList<String> str2 = new LinkedList<>();
        str1.add("pooja");
        str1.add("ram");
        str1.add("nikita");
        str1.add("ritika");
        str1.add("sakshi");
        // System.out.println(str1);
        // str1.addFirst("priya");
        // str1.addLast("vinayak");
        // System.out.println(str1);
        // System.out.println(str1.get(1));
        // str1.remove(3);
        // Collections.copy(str1, str2);
        // str2.add("p");
        // Collections.unmodifiableList(str1);
        // str1.add("pikd");
        // str1.set(0, "vdeg");

        // Collections.reverse(str1);
        // System.out.println(str1);

        // Collections.emptyList();
        // System.out.println(str1.clone());

        // System.out.println("str1" + str1);
        // System.out.println("str2" + str2);

        // List<String> str = Collections.unmodifiableList(str1);
        // // str.add("harshita");
        // str.set(1, "mcfdiv");
        // System.out.println(str);

        str1.set(1, "rekha");
        System.out.println(str1);

    }
}
