import java.util.Scanner;

public class _7Order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPrice = 0;

        System.out.println("Good Morning");
        System.out.println("1. Tea - Rs. 10");
        System.out.println("2. Coffee - Rs. 20");
        System.out.println("3. Cold Coffee - Rs. 50");
        System.out.println("4. Sandwich - Rs. 60");
        while (true) {
            System.out.print("What would you like to order? Enter the number of the item: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("order:" + "Tea");
                    totalPrice += 10;
                    // totalPrice = totalPrice + 10;
                    break;
                case 2:
                    System.out.println("order:" + "Coffee");
                    totalPrice += 20;
                    break;
                case 3:
                    System.out.println("order:" + "Cold coffee");
                    totalPrice += 50;
                    break;
                case 4:
                    System.out.println("order:" + "Sandwhich");
                    totalPrice += 60;
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid item.");
            }

            System.out.print("Thank you! Would you like to add anything else to your order? ");
            System.out.println("1. no / 2. yes");
            int addMore = sc.nextInt();
            int p = 1;
            if (addMore == p) {
                break;
            }
        }
        System.out.println("Total Price: Rs. " + totalPrice);

        sc.close();
    }

}
