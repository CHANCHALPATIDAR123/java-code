package StringPrectice;

class Reversstr {
    public static void main(String args[]) {
        String st = "chanchal";
        String sr = " ";
        char ch;
        for (int i = st.length() - 1; i >= 0; i--) {
            ch = st.charAt(i);
            sr = sr + ch;
        }
        System.out.println(sr);
    }
}