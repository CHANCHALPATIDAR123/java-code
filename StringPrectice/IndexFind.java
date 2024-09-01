package StringPrectice;

public class IndexFind {
    public static void main(String[] args) {
        String str = "OpenAI";
        System.out.println("String is:" + str);
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch == 'e') {
                System.out.println("Index of e:" + i);
            }
        }
    }
}
