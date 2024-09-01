import java.util.Scanner;

class NumberOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the Second number:");
        int b = sc.nextInt();
        System.out.println("Enter the third number:");
        int c = sc.nextInt();
        if (a < b && b < c) {
            System.out.println("the number is increasing order");
        }
        if (a > b && b > c) {
            System.out.println("the number is Dicreasing order");
        }
        sc.close();
    }
}
