package Str_1Java;

public class _1StringExample {
    public static void main(String[] args) {
        // literal type
        String greet1 = "Good morning class!!";
        String greet2 = "Good morning class!!";
        // System.out.println(greet1);
        // System.out.println(greet1.length());
        // System.out.println(greet1.charAt(10));
        // create String with new keyword
        /*
         * String s1 = new String("hello");
         * System.out.println(s1);
         * String s2 = new String("hello");
         * if (s1 == s2) {
         * System.out.println("String is equal");
         * } else {
         * System.out.println("not equal");
         * }
         * if (greet1 == greet2) {
         * System.out.println("greet is equal");
         * } else {
         * System.out.println("greet is no equal");
         * }
         */
        System.out.println(greet2.toUpperCase());
        System.out.println(greet1.substring(1));
        System.out.println(greet1.substring(1, 4));
        System.out.println(greet1.replace('g', 'r'));
        System.out.println(greet1.startsWith("Good"));
        System.out.println(greet1.indexOf(" "));
        System.out.println(greet1.equalsIgnoreCase("good morning"));
        System.out.println(greet1.codePointAt(3));
        System.out.println(greet1.concat("chanchu"));
        System.out.println(greet1.codePointBefore(2));
        System.out.println(greet1.codePointCount(0, 8));
        System.out.println(greet1.compareTo("Good morning class!!"));
        System.out.println(greet1.compareToIgnoreCase("good"));
        System.out.println(greet1.contains("Good morning class!!"));
        System.out.println(greet1.contentEquals("Good morning class!!"));
    }
}
