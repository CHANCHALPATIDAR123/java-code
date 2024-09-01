import java.util.Scanner;

public class _12AddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println("sum of digit:" + sum);
        sc.close();
    }
}
