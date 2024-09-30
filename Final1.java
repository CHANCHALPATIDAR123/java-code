/*class Bike9 {
    final int speedlimit = 90;// final variable
    {
        System.out.println(speedlimit);
    }

    void run() {
        speedlimit = 400;
        System.out.println(speedlimit);
    }

    public static void main(String args[]) {
        Bike9 obj = new Bike9();
        obj.run();
    }
}*/
class Bike {
    final void run() {
        System.out.println("running");
    }
    /*
     * class Honda extends Bike {
     * void run() {
     * System.out.println("running safely with 100kmph");
     * }
     */

    public static void main(String args[]) {
        // Honda honda = new Honda();
        // honda.run();
        Bike obj = new Bike();
        obj.run();
        new Bike10();
    }
}

class Bike10 {
    final int speedlimit;// blank final variable

    Bike10() {
        speedlimit = 70;
        System.out.println(speedlimit);
    }
}