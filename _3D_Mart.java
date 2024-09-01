import java.util.Scanner;

class Dmart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price;
        System.out.println("enter the amount:");
        double amount = sc.nextDouble();

        if (amount > 3000 && amount < 5000) {
            int discount = 500;
            price = amount - discount;
            System.out.println("totle price:" + price);
            double totlepurchesamount = amount + discount;
            System.out.println("Totel purchesamount:" + totlepurchesamount);
        } else if (amount > 10000) {
            price = amount - 50 / 100;
            System.out.println("price:" + price);
            if (amount > 10000 && amount < 15000) {
                System.out.println("Free Mixer");
            } else if (amount > 15000) {
                System.out.println("Free suitcase");
            } else {
                System.out.println("No Gifts");
            }
        } else {
            System.out.println("No Discount");
        }
    }
}
