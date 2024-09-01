package P1;
interface A1 {
     void showData();
    void  getData();
    abstract  void print();
}
 interface E1 extends A1 {
   void display();
}
class B implements A1,E1 {
    public void showData() {
        System.out.println("hello1");
    }
    public void getData() {
        System.out.println("hello2");
    }
    public void print(){
        System.out.println("hello3");
    }
    public void display(){
        System.out.println("hello4");
    }
}
class C1  {
    public static void main(String[] args) {
          A1 obj=new B() ;
          obj.getClass();
    }
}

/*interface API {
    default void show() {
        System.out.println("Default API");
    }
}

interface Interface1 extends API {
    void display();
}

interface Interface2 extends API {
    void print();
}

class TestClass implements Interface1, Interface2, API {
    public void display() {
        System.out.println("Display from Interface1");
    }

    public void print() {
        System.out.println("Print from Interface2");
    }

    public static void main(String args[]) {
        TestClass d = new TestClass();
        d.show();
        d.display();
        d.print();
        d.show();
    }
}*/
