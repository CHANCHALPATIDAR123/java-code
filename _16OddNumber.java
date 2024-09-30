import java.util.Scanner;

public class _16OddNumber {
    public static void oddNum(int n) {
        int rem, count = 0;
        while (n != 0) {
            rem = n % 10;
            if (n % 2 != 0) {
                count++;
            }
            n = n / 10;
        }
        System.out.println("odd number:" + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = sc.nextInt();
        oddNum(num);
        sc.close();
    }
}