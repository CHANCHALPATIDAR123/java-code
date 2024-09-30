class Dog11 {
    String color = "red";

    Dog11() {
        System.out.println("hello everyone");
    }

    Dog11(String name) {
        System.out.println(name);
    }
}

class Cow extends Dog11 {
    String color = "blue";

    void show() {
        System.out.println(color);
        System.out.println(super.color);
    }

    Cow() {
        // super(3);
        super("chanchal");
        // super("chanchal");
        System.out.println("good morning");
    }
}

public class Driver14 {
    public static void main(String[] args) {
        Cow obj = new Cow();
        obj.show();
    }
}
