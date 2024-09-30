package Collection1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Collection;
import java.util.Collections;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> obj1 = new ArrayList<>(Arrays.asList("name"));
        // Object obj2 = new ArrayList<>();
        // Collections.addAll("ram","shaym" );
        // Collections.addAll(obj2, "pooja","ram");
        // System.out.println(obj2);

        obj1.add("pooja");
        obj1.add("priya");
        obj1.add("sakshi");
        obj1.add("chanchal");
        // obj1.toArray();
        // System.out.println(obj1);
        // System.out.println(obj1.getClass());

        // obj1.ensureCapacity(20);
        // Collections.sort(obj1);
        // System.out.print(obj1);

        // System.out.println(obj1);
        // obj2 = obj1.clone();
        // System.out.println(obj1.equals(obj2));
        // System.out.println(obj1.toString());
        // System.out.println(obj1.contains(obj2));
        // System.out.println(obj2);

        // obj1.set(2, "nandni");
        // obj1.add(3, "nikita");
        // obj1.remove(3);
        // boolean p = obj1.contains("pooja");
        // System.out.println(p);
        // obj1.clear();
        // System.out.println(obj1.isEmpty());
        // obj1.remove(obj1);
        // System.out.println(obj1);
        // System.out.println(obj1.get(3));
        // System.out.println(obj1.set(1, "nandni"));

        // for (int i = 0; i < obj1.size(); i++) {
        // System.out.println(obj1);
        // System.out.println(obj1.get(i));
        // }

        // for (String str : obj1) {
        // System.out.println(str);
        // }

        /*
         * Iterator<String>li=obj1.iterator();
         * while (li.hasNext()) {
         * String next=li.next();
         * System.out.println(next);
         * }
         */
        // ArrayList L3 = obj1;
        // L3.add("retuk");
        // System.out.println(L3);
        // System.out.println(obj1);

        ArrayList L2 = (ArrayList) obj1.clone();
        // ArrayList L2 = new ArrayList(obj1);
        L2.add("fgh");
        System.out.println(L2);
        System.out.println(obj1);

    }
}
