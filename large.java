import java.util.Scanner;
public class large {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1:");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2:");
        int num2 = sc.nextInt();
        System.out.println("Enter the num3:");
        int num3 = sc.nextInt();
        int large = num1;

        if (num2 > large) {
            System.out.println("num2 is large number:" + num2);
        } else if (num3 > large) {
            System.out.println("num3 is large number:" + num3);
        } else {
            System.out.println("num1 is large number:" + large);
        }
        sc.close();
    }
}
