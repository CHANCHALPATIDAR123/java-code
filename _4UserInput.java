import java.util.Scanner;

public class _4UserInput {
    public static void main(String[] args) {
        Scanner scobj = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scobj.nextLine();
        System.out.println("My name is " + name);
        scobj.close();
    }
}
