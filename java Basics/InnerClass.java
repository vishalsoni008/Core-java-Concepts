 class A{
    int a=10;

    void Test(){
        Inner inner=new Inner();
        inner.display();
    }
    class Inner{
        void display(){
            System.out.println("inner class is call "+a);
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A a=new A();
        a.Test();
    }
}
