package Interview_Q;

import java.util.Scanner;

public class soru_09 {

        /*
      Perfect Number (Mukemmel sayi)
      Kullanici tarafindan bir sayiya kadar olan sayilarin,
      mukemmel olup olmadigini bulan method yaziniz.
      Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
      kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
      ORNEK: (6, 28, 496, 8128)
      INPUT      : 6
      OUTPUT     :  1,2,3

    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a perfect");
        perfectNumber(scan.nextInt());

    }

    public static void perfectNumber(int a) {

        int bolen = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) bolen += i;
        }
        if (bolen == a) System.out.println(a + " is a perfect number");
        else System.out.println(a + " is not  a perfect number");

    }


}
