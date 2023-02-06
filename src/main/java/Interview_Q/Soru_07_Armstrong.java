package Interview_Q;

import java.util.Scanner;

public class Soru_07_Armstrong {

     /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
        Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

          soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
          gösteren program yazınız */

    public static void main(String[] args) {

    // Halil hocam cozum
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = input.nextInt();
//        for (int i = 0; i <= num; i++) {
//            isArmstrongNumber(i);
//        }
//    }
//
//    static void isArmstrongNumber(int num) {
//        int sum = 0;
//        int length = String.valueOf(num).length();
//        for (int i = num; 0 < i; i /= 10) {
//
//            sum += Math.pow(i % 10, length);
//
//        }
//        if (num == sum) System.out.println(num + " is an Armstrong number.");
//    }

        //benim cozum
      Scanner scan = new Scanner(System.in);
      System.out.println("bir sayi giriniz");
     int sayi = scan.nextInt();
        int sum = 0;

        for (int i = 0; i <= sayi; i++) {
            sum = 0;
          int  length2 = String.valueOf(i).length();
            for (int j = i; 0 < j; j /= 10) {
                int a = j % 10;
                sum += Math.pow(a, length2);
            }
            if (i == sum) {
                System.out.println(i+"= Bu bir Armstrong sayidir");
            }
        }

    }
}


