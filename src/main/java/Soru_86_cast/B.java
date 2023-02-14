package Soru_86_cast;

public class B extends A{
    public  void t() {
        System.out.println("B");
    }

    public static void main(String[] args) {

//        A a = new A();
//        B c = (B) a;
//        a.test();
      //  a.t();

        B b = (B) new A(); // parent child data type kullanamaz cast yapilmalidir...
        b.t();
        b.test();

    }
}
