package StringPrectice;

import java.util.Scanner;

public class Compaire {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first string:");
        String str1 = sc.nextLine();
        System.out.println("enter second string:");
        String str2 = sc.nextLine();
        char ch;
        char ch1;
        for (int i = 0; i < str1.length(); i++) {
            ch = str1.charAt(i);
            ch1 = str2.charAt(i);
            if (ch == ch1) {
                System.out.println("true");
                break;
            } else {
                System.out.println("false");
                break;
            }
        }

    }
}
