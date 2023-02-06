package soru_staticblock;

public class B extends A{
    private B() {
    }
    private B(int a) {
    }

    static {
        System.out.println("static block B");
    }

    {
        System.out.println("Non-Static block B");
    }

    public static void main(String[] args) {
        B b = new B();
    }


    // cikti:
    // static block A
    //static block B
    //Non-Static block A
    //Non-Static block B  static bloklar once calisir.

}
