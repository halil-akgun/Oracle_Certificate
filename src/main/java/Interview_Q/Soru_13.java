package Interview_Q;

import java.util.Scanner;

public class Soru_13 {

    //  Kullanicidan toplanmak uzere sayilar isteyin
    // sayi adedi 10'u gecerse veya toplam 500 'u gecerse
    // bu kadar sayi yeter
    // ".. adet sayi girdin, toplami..." yazdirin

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

       int sayi =0;
       int counter = 0;
        while ((sayi<500)&&(counter!=10)){
            System.out.println("Sayi giriniz");
            sayi+=scan.nextInt();
            counter++;
        }
        System.out.println(sayi);
        System.out.println(counter);


    }
}
