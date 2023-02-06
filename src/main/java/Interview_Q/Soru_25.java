package Interview_Q;

import java.util.Arrays;

public class Soru_25 {



    // indexi tek sayi olan karakterleri yazdiran bir code create ediniz

    public static void main(String[] args) {

        String a = "green is beautiful";
        String[] arr = a.split("");
        //for (int i = 1; i < a.length(); i+=2) System.out.print(a.charAt(i));
        Arrays.stream(arr).filter(t -> a.indexOf(t)%2!=0).forEach(t -> System.out.print(t));

    }
}
