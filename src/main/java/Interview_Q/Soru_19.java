package Interview_Q;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Locale;

public class Soru_19 {

    /*
         Type java code by using while loop,
          Write a program to count the factors of an integer which is entered by user.
          Factors of 12 = 1, 2, 3, 4, 6, 12 ==> 6        Factors of 8  = 1, 2, 4, 8 ==> 4 */

    public static void main(String[] args) {



        int a = 16;
        int idx=1;
        int c= 0;
        while (idx<=a){

            if (a%idx==0){
                System.out.print(idx+" ");
                c++;
            }
            idx++;
        }
        System.out.println(" ==> "+c);




    }
}
