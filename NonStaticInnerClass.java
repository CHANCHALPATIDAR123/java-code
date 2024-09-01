class Outer2{
     int a=67;
    private int b=25;
    static int c=12;
    class Inner2{
        
        public void doSum(){
            System.out.println(a);
            System.out.println(b);
            System.out.println("sum:"+a+b+c);
        }
    }
}
class NonStaticClass{
    public static void main(String[] args) {
        Outer2.Inner2 obj1=new Outer2().new Inner2();
        obj1.doSum();
    
    }
}
