package Interview_Q;

import java.util.Scanner;

public class Soru_21 {

    public static void main(String[] args) {

         /*
        Ask user to enter an integer.
        If the integer is less than 100, tell user "Won!"
        Otherwise, tell user "Lost!"
       */

        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        do {
            System.out.println("bir sayi giriniz");
            sayi=scan.nextInt();
            if (sayi<100){
                System.out.println("Lost!!");
            }else System.out.println("Won!!");

        }while (sayi<100);



    }
}
