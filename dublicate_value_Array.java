import java.util.Scanner;

public class dublicate_value_Array {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the array element:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Display the array element:");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("Dublicate value of array:");
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[j]);
                }
            }
        }

        sc.close();
    }
}
