class Drive {
    public static void main(String[] args) {
        Kitten kg = new Kitten();
        kg.eat();
        kg.sleep();
        kg.miaw();
        BabyDog bg = new BabyDog();
        bg.eat();
        bg.bhow();
        bg.sleep();
    }
}

class Annimal {
    public void eat() {
        System.out.println("annimal eating");
    }

    public void sleep() {
        System.out.println("annimal is sleeping");
    }
}

class Cat extends Annimal {
    public void miaw() {
        System.out.println("cat voic miaw");
    }
}

class Kitten extends Cat {
    public void dance() {
        System.out.println("kitten dancing");
    }
}

class Dog extends Annimal {
    public void bhow() {
        System.out.println("dog voice");
    }
}

class BabyDog extends Dog {
    public void babydog() {
        System.out.println("i am baby dog");
    }
}
