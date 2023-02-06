package Interview_Q;

public class Soru_24 {

      /*
      AtbashCode ; bir metni şifrelemek veya şifresini çözmek için İbrani alfabesine temelli basit bir yöntemdir.
      Alfabenin ilk harfi son harfi yerine kullanilmaktadir..
      "abcdefghijklmnopqrstuvwxyz"; 26 harf
      "zyxwvutsrqponmlkjihgfedcba";
     */

    public static void main(String[] args) {

        String str = "gulsum";

        String a = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < str.length(); i++) {

            System.out.print(a.charAt(a.length() - 1 - (a.indexOf(str.charAt(i)))));

        }

    }
}
