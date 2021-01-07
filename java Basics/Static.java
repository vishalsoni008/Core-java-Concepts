public class Static {
    static int a=10;
    static int b;

    static void method(int x){
        System.out.println("method value is "+x);
        System.out.println("b value is  "+b);
    }

    static{
        System.out.println("Static block invoke ");
        b=a*2;
    }

    public static void main(String[] args) {
        Static s=new Static();
        s.method(22);
    }
    
}
