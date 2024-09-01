package StringPrectice;

class CheckStartingNum {
    public static void main(String[] args) {
        String str = "hello";
        String str1 = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch == 'h' || ch == 'e') {
                str1 += ch;
            }
        }
        System.out.println("String is start he:" + str1);
    }
}
