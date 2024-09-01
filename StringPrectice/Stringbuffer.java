package StringPrectice;

public class Stringbuffer {
    public static void main(String[] args) {
        // String str1 = "example.com";
        // String str2 = "Example.com";

        StringBuffer s1 = new StringBuffer("example.com");
        StringBuffer s2 = new StringBuffer("example.com");
        boolean result = com(s1, s2);
        System.out.println(result);
    }

    public static boolean com(StringBuffer s1, StringBuffer s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
