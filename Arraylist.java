import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        System.out.println("enter the array size:");
        int n = sc.nextInt();
        // sc.nextLine();
        System.out.println("enter the array element:");
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            list.add(input);
        }
        System.out.println("1 Display the array element:");
        for (String item : list) {
            System.out.println(item);
        }
        // Adding one more value to the array
        System.out.println("Enter one more element to add:");
        String additionalElement = sc.nextLine();
        list.add(additionalElement);
        System.out.println("2 Display the array element:");
        for (String item : list) {
            System.out.println(item);
        }
        System.out.println(list.get(3));
        System.out.println(list.set(0, "ranu"));
        System.out.println(list.size());

        System.out.println("3 Display the array element:");
        for (String item : list) {
            list.set(0, "ranu");
            System.out.println(item);
        }
        sc.close();
    }
}
