public class swapping2 {
    public static void main(String args[]) {
        int a = 40;
        int b = 50;
        System.out.println("after swapping:");
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("before swapping:");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a:" + a);
        System.out.println("b:" + b);

    }
}
