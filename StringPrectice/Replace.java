package StringPrectice;

public class Replace {
    public static void main(String[] args) {
        String str1 = "The quick brown fox jumps over the lazy dog";
        System.out.println(str1);
        String[] strArray = str1.split(" ");

        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].equalsIgnoreCase("dog")) {
                strArray[i] = "cat";
            }
        }
        String newstr = " ";
        for (int i = 0; i < strArray.length; i++) {
            newstr = newstr + strArray[i] + " ";
        }
        System.out.println(newstr);
    }
}
