package StringPrectice;

public class PalindromCheck {
    public static void main(String[] args) {
        String str1 = "ababa";
        String str2 = "";

        for (int i = str1.length() - 1; i >= 0; i--) {
            str2 += str1.charAt(i);
        }
        System.out.println("String 2:" + str2);
        System.out.println(str2.length());
        if (str1.equals(str2)) {
            System.out.println("String is palindrom");
        }
    }
}
