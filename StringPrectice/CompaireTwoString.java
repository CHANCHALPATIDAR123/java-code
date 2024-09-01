package StringPrectice;

class CompaireTwoString {
    public static void main(String[] args) {
        String str1 = "this is exercise 2";
        String str2 = "this is Exercise 2";

        /*
         * char[] str3 = str1.toCharArray();
         * char[] str4 = str2.toCharArray();
         * if (str1.equalsIgnoreCase(str2)) {
         * System.out.println("equal");
         * } else {
         * System.out.println("not equal");
         * }
         */
        int result = comparString(str1, str2);
        if (result < 0) {
            System.out.println(str1 + "is less than" + str2);
        } else if (result > 0) {
            System.out.println(str1 + " is grether than" + str2);
        } else {
            System.out.println(str1 + "equal" + str2);
        }
    }

    public static int comparString(String str1, String str2) {
        int i = 0;
        while (i < str1.length() && i < str2.length()) {
            // if (str1.charAt(i) != str2.charAt(i)) {
            // return str1.charAt(i) - str2.charAt(i);
            // }

            if (str1.equalsIgnoreCase(str2)) {
                return 0;
            }
            i++;
        }
        if (str1.length() == str2.length()) {
            return 0;
        } else {
            return str1.length() - str2.length();
        }

    }
}
