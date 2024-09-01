public class StrRev {
    public static void main(String[] args) {
        String s = "chanchal";
        String s1 = "chanchal";
        System.out.println(s.equals(s1));

        int len = s.length();
        for (int i = len - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}
