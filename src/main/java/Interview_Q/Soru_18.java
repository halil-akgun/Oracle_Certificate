package Interview_Q;

public class Soru_18 {

 /*
        create one int
        do while int is less than 100
        print the number
        increment by 5
        for example: 0   5   10  15  20
     */

    public static void main(String[] args) {

        int a = 0;
        do {
            System.out.print(a + " ");
            a += 5;
        } while (a < 100);

    }
}
