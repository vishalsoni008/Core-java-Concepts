public class Garbage {
    public static void main(String[] args) {
        
        Garbage g1=new Garbage();
        Garbage g2=new Garbage();

        g1=null;

        System.gc();

        g2=null;
        Runtime.getRuntime().gc();

    }
    protected void finalize(){
        System.out.println("Garbage collect "+this);
        System.out.println("Garbage collect "+this);

    }
}
