package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee_1 {
    int id;
    String name;
    String address;

    Employee_1(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getid() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getaddress() {
        return address;
    }

    public String toString() {
        return ("id:" + id + "name:" + name + "address:" + address);
    }

    public static class IdComparator implements Comparator<Employee_1> {
        @Override
        public int compare(Employee_1 e1, Employee_1 e2) {
            return Integer.compare(e1.getid(), e2.getid());
        }
    }

    public class idComparetor {
    }
}

class SortEmployee {
    public static void main(String[] args) {
        List<Employee_1> emp = new ArrayList<>();
        emp.add(new Employee_1(1, "ram", "indore"));
        emp.add(new Employee_1(6, "rinku", "neemuch"));
        emp.add(new Employee_1(3, "ranju", "manasa"));

        Collections.sort(emp, new Employee_1.IdComparator());
        for (Employee_1 ep : emp) {
            System.out.println("emp:" + ep);
        }
    }
}
