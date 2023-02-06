package Interview_Q;

import java.util.HashMap;

public class Soru_23 {

    /*
   Interview sorusu...
   Verilen bir metindeki harflerin frekansını(tekrar sayısı) bulup yazdıran bir METHOD yazınız.

   Test data:
   Input = AAABBCDD
   output = A3B2C1D2
           */

    public static void main(String[] args) {

        HashMap<String,Integer> result = new HashMap<>();
        String str = "batman is beautiful";

        for (int i = 0; i < str.length(); i++) {
            Integer a = result.get(String.valueOf(str.charAt(i)));
            if (a==null){
                result.put(String.valueOf(str.charAt(i)), 1);
            }else result.replace(String.valueOf(str.charAt(i)), a+1);
        }
        System.out.println(result);
    }
}
