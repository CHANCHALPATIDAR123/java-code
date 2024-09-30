package P1;

class A12 {
    static void show1() {
        System.out.println("hello1");
    }
}

class B12 extends A12 {
    static void show1() {
        System.out.println("hello2");
    }

    public static void main(String args[]) {
        B12.show1();
    }
}

class _Static extends B12 {
    public static void main(String[] args) {
        // B12 ob = new B12();
        // B12.show1();
        A12.show1();
    }
}
