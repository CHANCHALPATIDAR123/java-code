class _29Static {
    static int a = 10;
    static int b = 20;

    public static void Sum(int a, int b) {
        // int a = 10;
        // int b = 20;
        System.out.println(a + b);
    }

    static {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Sum(10, 20);
    }
}
