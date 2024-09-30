abstract class Bank {
    void show1() {
        System.out.println("Hello");
    }

    Bank() {
        System.out.println("Pooja");
    }

    abstract int getRateOfInterest();
}
class SBI extends Bank {
    int getRateOfInterest() {
        return 7;
    }
}
// must be implement the abstract method in a child class
class PNB extends Bank {
    int getRateOfInterest() {
        return 8;
    }
    PNB() {
        System.out.println("chanchal");
    }
}
class TestBank {
    public static void main(String args[]) {
        Bank b = new SBI();
        b = new PNB();
        System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");
        b = new SBI();
        System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");
        b.show1();
    }
}