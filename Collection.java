import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Set;
import java.util.Map;

class MyCollection {
    public static void main(String[] args) {
        Collection<String> obj1 = new ArrayList<>();
        ArrayList<Integer> obj2 = new ArrayList<>();
        // List<Integer> obj3 = new ArrayList<>();
        // Set<Integer> obj4 = new TreeSet<>();
        // Map<String>obj5=new HashMap<>();
        obj1.add("pooja");
        obj1.add("chanchal");
        obj1.add("priya");
        Iterator<String> itr = obj1.iterator();
        while (itr.hasNext()) {
            String next = itr.next();
            System.out.println(next);
        }
    }

}