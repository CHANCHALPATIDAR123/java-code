
class Container<T> {
    T value;

    public void show() {
        System.out.println(value.getClass().getName());
    }
}

public class Demo11 {
    public static void main(String[] args) {
        Container<Integer> c = new Container<>();
        c.value = 5;
        c.value = 10;
        c.show();
    }
}
