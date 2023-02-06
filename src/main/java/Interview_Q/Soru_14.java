package Interview_Q;

public class Soru_14 {

    /*
    Kullanicidan bir isim ve karakter girmesini isteyin, sonra karakterin kac kez tekrarlandigini kontrol edin.
            char ch= 'e' ;
            String name ="Sevecen"
            => Tekrar Sayisi = 3
     */

    public static void main(String[] args) {
        char ch = 'e';
        String name = "Sevecen";

        int counter = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ch) counter++;
        }
        System.out.println(counter);
    }
}
