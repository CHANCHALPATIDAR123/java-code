package StringPrectice;

public class ConcateString {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        char[] concatentedArray = new char[charArray1.length + charArray2.length];

        for (int i = 0; i < charArray1.length; i++) {
            concatentedArray[i] = charArray1[i];
        }
        for (int i = 0; i < charArray2.length; i++) {
            concatentedArray[charArray1.length + i] = charArray2[i];
        }
        String concatString = new String(concatentedArray);
        System.out.println("concatented string:" + concatString);
    }
}
