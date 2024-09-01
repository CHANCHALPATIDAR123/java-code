import java.util.Scanner;

public class _14pal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rem, rev = 0, temp;
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        temp = num;
        while (num != 0) {
            rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;
        }
        System.out.println("revers number:" + rev);
        if (temp == rev) {
            System.out.println("Number is pallindrom");
        } else {
            System.out.println("Not a pllindrom");
        }
        sc.close();
    }
}