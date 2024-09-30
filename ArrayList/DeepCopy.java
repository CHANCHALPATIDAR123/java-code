package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class DeepCopy {
    public static void main(String[] args) {
        ArrayList<String> obj1 = new ArrayList<>(Arrays.asList("pooja", "sonam", "ritika"));
        // ArrayList obj2 = (ArrayList) obj1.clone();
        // obj2.add("gita");
        // System.out.println("original:" + obj1);
        // System.out.println("Shallow Copy:" + obj2);
        Collection<String> st = Collections.unmodifiableCollection(obj1);
        st.add("pp");
    }
}
