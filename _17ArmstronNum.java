import java.util.Scanner;

class Num {
    public void armNum(int n) {
        int sum = 0, rem;
        int temp = n;
        while (n > 0) {
            rem = n % 10;
            sum = sum + (rem * rem * rem);
            n = n / 10;
        }
        if (sum == temp) {
            System.out.println("this number is armstron number:" + sum);
        } else {
            System.out.println("This number is no armstron number:" + temp);
        }
    }
}

public class _17ArmstronNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = sc.nextInt();
        Num cp = new Num();
        cp.armNum(num);
        sc.close();
    }
}
