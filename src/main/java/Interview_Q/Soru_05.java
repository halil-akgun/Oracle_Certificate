package Interview_Q;

public class Soru_05 {

    /*
     * Kullanicidan bir cumle ve bir harf alin,
     * Cumlede harfin kac kere
     * kullanildigini bulup, yazdirin
     *
     * ORNEK:
     * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
     * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
     */

    public static void main(String[] args) {

        String a = "Java ogrenmek cok guzel.";
        char ch = 'e';
        System.out.println("Girdiginiz cumlede \"" + ch + "\" harfi " + howMany(a, ch) + " kere kullanilmistir.");

    }

    public static int howMany(String str, char ch) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) counter++;
        }
        return counter;
    }


}
