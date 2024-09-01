package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class FrequcancyClass {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("mango");
        list.add("banana");
        list.add("mango");
        list.add("mango");
        for (String li : list) {
            System.out.println(li);
        }
        int fr = Collections.frequency(list, "apple");
        System.out.println("apple:" + fr);
        fr = Collections.frequency(list, "banana");
        System.out.println("banana:" + fr);
        fr = Collections.frequency(list, "mango");
        System.out.println("manago:" + fr);
    }
}