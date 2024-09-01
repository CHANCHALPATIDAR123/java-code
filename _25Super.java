class A {
    public void show() {
        System.out.println("hello");
    }
}

class B extends A {
    public void work() {
        show();
    }
}

public class _25Super {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
