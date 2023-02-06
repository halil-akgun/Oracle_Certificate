package Interview_Q;

public class Soru_17 {
    public static void main(String[] args) {


         /*
            Problem Tanımı :
            farklı 4 öğrencinin sırasıyla 6,4,3 ve 5 yazılı notlarının ortalamasını
            yazdıran parametreli method yazınız.
         */

        ort("Gulsum",12,34,56,78);

    }

    public static void ort(String name, double ...not){

        int count =0;
        double top=0;
        for (double w: not){

            count++;
            top+=w;
        }
        System.out.println(name+" "+(top/count));

    }



}
