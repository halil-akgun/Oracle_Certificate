package Interview_Q;

import java.util.Scanner;

public class Soru_22 {
    /*
            How many times a given number is repeated in a sequence
            Create the Java program that finds it.
     */
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 22, 23, 85, 66, 99, 88, 44, 22, 33, 33, 55, 44, 66, 99, 77, 11, 0, 58, 77, 66, 22, 23, 77};
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int counter = 0;
        for (int w : arr) {
            if (w == a) counter++;
        }
        System.out.println(counter);
    }
}
