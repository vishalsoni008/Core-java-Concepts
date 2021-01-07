public class Garbage {
    public static void main(String[] args) {
        
        //First object created
        Garbage g1=new Garbage();
        //Second object created
        Garbage g2=new Garbage();
        
        //Assign value null both side
        g1=null;
        //GArbage collector 
        System.gc();

        g2=null;
        Runtime.getRuntime().gc();

    }
    protected void finalize(){
        System.out.println("Garbage collect "+this);
        System.out.println("Garbage collect "+this);

    }
}
