package ArrayList;

import java.util.Collections;
import java.util.HashSet;

public class Set1 {
    public static void main(String[] args) {
        HashSet<String> c1 = new HashSet<>();
        // HashSet<String>c2=new HashSet<>();
        c1.add("1");
        c1.add("2");
        c1.add("3");
        c1.add("4");
        c1.add("5");
        c1.add("5");
        c1.add("ram");
        c1.add("pooja");
        c1.clone();
        // c1.contains(c1);

        System.out.println(c1.size());
        System.out.println(c1);
        System.out.println(c1.remove("2"));
        System.out.println();
        for (String sr : c1) {
            System.out.println(sr);
        }
    }

}
