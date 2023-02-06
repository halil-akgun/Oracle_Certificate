package Interview_Q;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru_08_fibonacci {

      /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34....
     */

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();

        List<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);

        int temp = 0;
        while (true) {
            temp = (arr.get(arr.size() - 1)) + (arr.get(arr.size() - 2));
            if (temp > a) break;
            arr.add(temp);
        }
        System.out.println(arr);

    }
}
