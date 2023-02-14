package soru_104;

import java.time.DateTimeException;

public class DrivedB extends DrivedA {

    public void test() {
        System.out.println("DrivedB ");
    }

    int a;

    public static void main(String[] args) {


        Base b1 = new DrivedB();
        Base b2 = new DrivedA();
        Base b3 = new DrivedB();
        Base b4 = (DrivedA) b3;
        b1 = (Base) b3;
        b1.test();
        b4.test();


        // a++;

    }

    static void b() {
        //a++;
    }

}
