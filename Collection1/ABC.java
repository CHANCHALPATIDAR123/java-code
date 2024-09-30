package Collection1;

class ABC {
    // instance variable of the class ABC
    int x = 30;
}

class ShallowCopyExample {
    // main method
    public static void main(String[] args) {
        ABC obj1 = new ABC();

        // it will copy the reference, not value
        ABC obj2 = obj1;

        // updating the value to 6
        // using the reference variable obj2
        obj2.x = 6;

        // printing the value of x using reference variable obj1
        System.out.println(obj1.x);
        System.out.println(obj2.x);
    }
}