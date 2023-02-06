package Interview_Q;

import java.util.Scanner;

public class Soru_04 {
    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String giris="";

        String pin = "1234";

        int hak=3;

        while (hak!=0){
            System.out.println("pin giriniz");
            giris = scan.next();
            if (giris.equals(pin)){
                System.out.println("Basarili");
                hak=0;
                continue;
               // break;

            }else {
                System.out.println("Yanlis giris yaptiniz");
            }
            hak--;
            if(hak==0){
                System.out.println("Kartiniz bloke oldu");
            }
        }

    }
}
