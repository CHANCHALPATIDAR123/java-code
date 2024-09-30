package ArrayList;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return ("name:" + name + "age:" + age);
    }

    public static class AgeComparator implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            return Integer.compare(p1.getAge(), p2.getAge());
        }
    }
}

class SortPerson {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();
        person.add(new Person("ram", 25));
        person.add(new Person("priya", 30));
        person.add(new Person("nikita", 20));

        Collections.sort(person, new Person.AgeComparator());

        for (Person p : person) {
            System.out.println(p);
        }
    }
}