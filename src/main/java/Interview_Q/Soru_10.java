package Interview_Q;

import java.util.Scanner;

public class Soru_10 {

    /*
     Create a function that takes an array and the difference between the largest
     and the smallest numbers.
     Ask user to enter array elements.
     kullanıcının girdigi bir array'in en buyuk elemani ile
     en kucuk elemanının  farkını bulan bir method create ediniz.
 */

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("array in uzunlugunu girin:");
        int length = inp.nextInt();
        System.out.println("sayilari girin:");
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = inp.nextInt();
        }
        difference(arr);
    }

    static void difference(int[] a) {
        int min = a[0];
        int max = a[0];
        for (int w : a) {
            min = Math.min(min, w);
            max = Math.max(max, w);
        }
        System.out.println(max-min);
    }
}
