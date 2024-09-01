class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    Person(Person obj2) {
        this.name = obj2.name;
        this.id = obj2.id;
        System.out.println("check the value are change or not");
        this.name = "pooja";
        this.id = 231;
    }
}

class Driver {
    public static void main(String[] args) {
        System.out.println("First Object");
        Person p1 = new Person("Avni", 68);

        // System.out.println("Name :" + p1.name + " and Id :" + p1.id);
        System.out.println();
        Person p2 = new Person(p1);
        System.out.println("name:" + p2.name + "id:" + p2.id);
        System.out.println("Copy Constructor used Second Object");
        // System.out.println(p2);
    }
}
