package Interview_Q;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru_16 {

    /*
  Problem Tanımı :
  getSum isminde bir method oluşturun.
  Parametresi ArrayList'tir.
  Dizideki tüm $ ları kaldır ve tüm sayıları topla
  return yaptğımız veri tipi 'int' olmalıdır.
  sonuç 0'dan küçükse, -1 yazdırın.

  Örnek1:
  ArrayList = $13, $15, $20
  Cevap = 48 olmalı

  Örnek 2 :
  ArrayList= $-13, $0, $0
  Cevap = -1 olmalı.
   */
    public static void main(String[] args) {
        List<String> arr = List.of("$13","$-35","$20");
        System.out.println(getSum(arr));
    }

    static int getSum(List<String> a) {
        int sum = 0;
        for (String w : a) {
            sum += Integer.parseInt(w.replaceAll("[$]", ""));
        }
        return (sum >= 0) ? sum : -1;
    }


}
