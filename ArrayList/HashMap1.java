package ArrayList;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String, String> str1 = new HashMap<>();
        str1.put("s01", "pooja");
        str1.put("s02", "chanchal");
        str1.put("s03", "ritika");
        str1.put("s04", "neha");
        str1.put("s05", "divya");
        System.out.println(str1.get("s04"));
        System.out.println(str1.clone());
        System.out.println(str1);
        // for (Map.Entry<String, String> entry : str1.entrySet()) {
        // String k = entry.getKey();
        // String v = entry.getValue();
        // System.out.println("Key:" + k + "value:" + v);
        // }
        str1.forEach((key, value) -> System.out.println("key:" + key + "value:" + value));
    }
}
