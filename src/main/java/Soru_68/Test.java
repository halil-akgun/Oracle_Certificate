package Soru_68;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        try {
            methodi();
        } catch (MyException e) {
            System.out.print("A");
        }
    }

    static void methodi() {  // line nl
        try {
            throw 3 < 10 ? new MyException() : new IOException();
        } catch (IOException ie) {
            System.out.println("I");
        }  catch (Exception ne) {
            System.out.print("A");
        }
    }
}
