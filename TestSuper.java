class A21 {
    int x = 10;

    A21() {
        System.out.println("I am class A");
    }
}

class B21 extends A21 {
    int x = 20;
    {
        System.out.println("A:" + super.x);
    }

    B21() {
        System.out.println(super.x);
        System.out.println("I am class B");

    }
}

class C21 extends B21 {
    int x = 30;

    C21() {
        System.out.println("I am class C");
        // If you want to print the value of 'x' from superclass B
        System.out.println("Value of x in class B: " + super.x);
        // If you want to print the value of 'x' from superclass A
        System.out.println("A:" + super.x);
        // System.out.println("Value of x in class A: " + ((A21) this).x);
    }
}

class Test21 {
    public static void main(String[] args) {
        C21 c = new C21();
        // Print value of x in class C
        System.out.println("Value of x in class C: " + c.x);
    }
}
