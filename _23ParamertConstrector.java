class Dog1 {
    String breed;

    Dog1(String br) {
        breed = br;
    }

    void display() {
        System.out.println("Breed" + breed);
    }
}

class Driver2 {
    public static void main(String[] args) {
        Dog1 myDog = new Dog1("Labrador");
        Dog1 me = new Dog1("litle");
        myDog.display();
        me.display();

    }
}
