import java.util.Scanner;

public class _5User_age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("you are aligeble for vote");
        } else {
            System.out.println("you are not eligible");
        }
        age = age + 10;
        System.out.println("user age after 10 years:" + age);
        sc.close();
    }
}
