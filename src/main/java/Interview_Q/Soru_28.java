package Interview_Q;

import java.lang.reflect.Array;
import java.util.*;

public class Soru_28 {

      /*
        Write a code that returns the duplicate chars in a String array.
        (interview Question)
        Input :
        String str=“Javaisalsoeasy”
        Output: [a, s]
         */

    public static void main(String[] args) {

        String str="Javaisalsoeasy";
        String[] arr = "Javaisalsoeasy".split("");
        //List<String> list = Arrays.asList(arr);


        List<String > list = new ArrayList<>();
        int sayac=0;

        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {

            if (arr[i-1].equals(arr[i])){

                if (!list.contains(arr[i])) list.add(arr[i]);
            }
        }
        System.out.println(list);











    }
}
