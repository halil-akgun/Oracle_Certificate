package Interview_Q;

public class Soru_27 {


    //Get 2 numbers from the user.
    //first number base
    //second number Top
    //Write a code that calculates the prime of a number.
    // 2, 3 --> 2^3 = 2*2*2= 8

    // 4, 3 --> 4^3= 4*4*4 = 64

    public static void main(String[] args) {
        int base = 2;
        int top = 3;
        System.out.println(Math.pow(base,top));
        int sum =1;
        for (int i = 0; i < top; i++) {
            sum*=base;
        }
        System.out.println(sum);



    }

}
