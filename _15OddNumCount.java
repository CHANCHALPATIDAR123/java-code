import java.util.Scanner;

class CountNum {
    public void countOddnumber(int[] n, int size) {
        int count = 0;

        for (int i = 0; i < size; i++) {
            if (n[i] % 2 != 0) {
                count++;
            }
        }
        System.out.println("Odd number:" + count);

    }
}

public class _15OddNumCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CountNum cp = new CountNum();
        System.out.println("Enetr the array size:");
        int size = sc.nextInt();
        int[] num = new int[size];
        System.out.println("enter the array number:");
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
        cp.countOddnumber(num, size);
        sc.close();
    }
}
