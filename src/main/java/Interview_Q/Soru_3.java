package Interview_Q;

import java.util.ArrayList;
import java.util.List;

public class Soru_3 {

      /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */
    /*
    girilen sayi kadar ki asal sayilari yazdiran program:
     */

    public static void main(String[] args) {
        System.out.println(isPrime(37));

        System.out.println(primes(15));

    }

    public static boolean isPrime(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) return false;
        }
        return true;
    }
    public static List<Integer> primes(int a){
        boolean isPrime=true;
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= a; i++) {
            isPrime=true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime) primes.add(i);
        }
        return primes;
    }
}
