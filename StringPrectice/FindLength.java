package StringPrectice;

public class FindLength {
    public static void main(String[] args) {
        String str1 = "chanchal";
        char[] str2 = str1.toCharArray();
        char str3[] = new char[str1.length()];
        int Length = 0;
        for (int i = 0; i < str1.length(); i++) {
            str3[i] = str1.charAt(i);
            Length++;
        }
        System.out.println("length of the string:" + Length);
    }

}
