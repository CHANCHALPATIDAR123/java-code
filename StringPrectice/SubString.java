package StringPrectice;

public class SubString {
    public static void main(String args[]) {
        String str = "abcdef";
        char[] ch = str.toCharArray();
        int n = ch.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                int k = i + j - 1;
                for (int p = j; p <= k; p++) {
                    System.out.print(ch[p]);
                }
                System.out.println();
            }
        }
    }
}
