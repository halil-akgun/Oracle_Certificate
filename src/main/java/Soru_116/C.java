package Soru_116;

public class C extends B{
    public void test () {
        System.out.println ("Z");
    }
    public static void main (String [] args) {
        A b1 = new A ();
        A b2 = new C ();
        b1 = (A) b2; //line nl
        A b3 = (B) b2; //line n2
        b1.test ();
        b3.test ();
    }
}
