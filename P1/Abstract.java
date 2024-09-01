package P1;
/**
 * InnerAbstract
 */
 interface InnerAbstract1 {
     void  hello1();
    final int a=10;
    static void print1(){
        System.out.println("hello5");
    }  
    private static void p(){
        System.out.println("hello6");
    }
    
}
/**
 * InnerAbstract
 */
 interface InnerAbstract2{
void hello2(); 
}
class Abstract implements InnerAbstract1{
    public void hello1(){
    System.out.println("hello1");
    }
    public void hello2(){
        System.out.println("hello2");
    }
}
abstract class D1 implements A1{
          D1(){
                    System.out.println("hello 6");
          }
}
class Demo1{
    public static void main(String[] args) {
        Abstract obj=new Abstract();
    }
}
