package Interview_Q;

public class Soru_12Polindrome {

    /*
     Crteate a program checks if a String is PALINDROME or not.
     If a word, phrase, or sequence that reads the same backword as forward then it is called "palindrome",
     For Example : "madam" or "nursesrun" .
     Kuulanıcının girdiği bir  String'in PALINDROME olup olmadığını kontrol eden bir method create ediniz
     polindrome :tersten okunuşu da aynı olan ifadeierdir.
     ornek : Ey edip Adanada pide ye,  Traş niçin şart
      */
    public static void main(String[] args) {
        String str = "madaMq";

        // 1. yol
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse().toString().equalsIgnoreCase(str) ? str + " is palindrome" : str + " is not palindrome");

        // 2. yol
        String str2 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str2 += str.charAt(i);
        }
        System.out.println(str2.equalsIgnoreCase(str) ? str + " is palindrome" : str + " is not palindrome");

    }
}
