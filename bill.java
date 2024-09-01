import java.util.Scanner;
public class bill {
    public static void main(String args[]) {
        double bill, discount, rate, qty, net;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the qty:");
        qty = sc.nextDouble();
        System.out.println("Enter the rate:");
        rate = sc.nextDouble();

        bill = qty * rate;
        System.out.println("bill amount:" + bill);

        discount = bill * 10 / 100;
        System.out.println("discount:" + discount);

        net = bill - discount;
        System.out.println("net amount:" + net);
        sc.close();
    }
}
