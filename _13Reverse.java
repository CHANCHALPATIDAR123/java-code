import java.util.Scanner;

public class _13Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rem, rev = 0;
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        while (num != 0) {
            rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;
        }
        System.out.println("revers number:" + rev);
        sc.close();
    }
}
