package Interview_Q;

import java.util.Scanner;

public class soru_2 {


    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */
    public static void main(String[] args) {

        String a = "Batman";
        int c = 5;
        String b = a.charAt(0) + "" + a.charAt(a.length() - 1);
        System.out.println(b.repeat(c));

    }
}
