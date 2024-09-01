package StringPrectice;

public class CapFirstLitter {
    public static void main(String[] args) {
        String str1 = "vinayak";
        String str2 = " ";
        for (int i = 0; i < str1.length(); i++) {
            if (i == 0) {
                str1 = str1 + ((char) (str1.charAt(i) + 32));
            } else {
                str1 = str1 + str1.charAt(i);
            }
        }
        System.out.println(str2);
    }
}
