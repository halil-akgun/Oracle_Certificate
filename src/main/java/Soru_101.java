import java.util.Arrays;

public class Soru_101 {

    public static void main(String[] args) {

        int numbers[];
        numbers = new int[2];
        numbers[0] = 10;
        numbers[1] = 20;
        System.out.println(Arrays.toString(numbers));


        numbers = new int[4];
        numbers[2] = 30;
        numbers[3] = 40;
        for (int x : numbers) {
            System.out.print(" " + x);


        }         System.out.println(Arrays.toString(numbers));
    }
}