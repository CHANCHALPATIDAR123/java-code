package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

class Prectice1 {
    public static void main(String[] args) {
        ArrayList<String> li = new ArrayList<>();
        li.add("red");
        li.add("blue");
        li.add("pink");
        li.add("green");
        // System.out.println(li); Q1

        /*
         * for(String str:li){
         * System.out.println("Color:"+li);
         * } Q2
         */

        // li.set(0, "chanchal");
        // System.out.println(li);Q3

        // System.out.println(li.get(1)); Q4

        // li.add(0, "neha");
        // System.out.println(li); Q5

        // li.remove(3);
        // System.out.println(li); Q6

        // System.out.println(li.indexOf("pink")); Q7

        // Collection.sort(li);

        // System.out.println(li.clone()); Q9

        /*
         * ArrayList<String>str=new ArrayList<>();
         * 
         * str.add("red");
         * str.add("pink");
         * 
         * System.out.println(li.equals(str)); Q12
         */

        // Collections.sort(li);
        // System.out.println(li); Q8

        // Collections.reverse(li); Q11
        // Collections.shuffle(li); Q10
        // Collections.swap(li, 2, 3);
        // System.out.println(li); Q13

        // li.trimToSize(); Q14

        for (int i = 0; i < li.size(); i++) {
            System.out.print(i + ": ");
            System.out.println(li.get(i));
        }

    }
}
