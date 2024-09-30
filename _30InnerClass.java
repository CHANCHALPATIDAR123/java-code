class Outer {
    static int a = 10;
    static int b = 5;

    static class Inner {
        // void disp() {
        // System.out.println(a);
        // System.out.println(b);

        public static void main(String[] args) {
            // new Outer.Inner().disp();
            System.out.println("this is allow show ");

        }
    }
}
