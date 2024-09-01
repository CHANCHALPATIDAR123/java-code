import java.util.*;
public class _1Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter the value a:");
        double a = sc.nextDouble();
        System.out.println("Enter the value b:");
        double b = sc.nextDouble();
        double result;
        System.out.println("Enter the opertation:");
        char operation = sc.next().charAt(0);
        switch (operation) {
            case '+':
                result = a + b;
                System.out.println("add=" + result);
                break;
            case '-':
                result = a - b;
                System.out.println("sub=" + result);
                break;
            case '*':
                result = a * b;
                System.out.println("multiple=" + result);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("infinite value please try again");
                } else {
                    result = a / b;
                    System.out.println("Divide=" + result);
                    break;
                }

        }
        sc.close();
    }
}
