import java.util.*;

public class _6Cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter the value a:");
        double a = sc.nextDouble();
        System.out.println("Enter the value b:");
        double b = sc.nextDouble();
        double result;
        System.out.println("Enter the opertation:");
        char operation = sc.next().charAt(0);
        if (operation == '+') {
            result = a + b;
            System.out.println("a+b=" + result);
        } else if (operation == '-') {
            result = a - b;
            System.out.println("a-b=" + result);
        } else if (operation == '*') {
            result = a * b;
            System.out.println("a*b=" + result);
        } else if (operation == '/') {
            if (b == 0) {
                System.out.println("infinite value please try again");
            } else {
                result = a / b;
                System.out.println("Divide=" + result);
            }
        } else if (operation == '%') {
            result = a % b;
            System.out.println("a%b=" + result);
        } else {
            System.out.println("please valid input");
        }
        sc.close();
    }
}
