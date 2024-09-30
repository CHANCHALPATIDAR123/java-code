package StringPrectice;

public class ConvertLowerCase {
    public static void main(String[] args) {
        String str1 = "JAVA IS INDEPENDET";
        System.out.println("original String:" + str1);

        String lowercaseString = StirngConvert(str1);
        System.out.println("string lowercase:" + lowercaseString);
    }

    public static String StirngConvert(String str) {
        char ch;
        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            str2.append(ch);
        }
        return str2.toString();
    }
}
