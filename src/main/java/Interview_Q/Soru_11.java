package Interview_Q;

public class Soru_11 {

      /*
		// Stringi ters cevirmek icin bir Java Programi yazin
		//1.Yol: StringBuilder () kullanarak
		//2.Yol: String Classini kullanarak
		//3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
    */


    public static void main(String[] args) {

        //1. Yol

        StringBuilder sb = new StringBuilder("Hava cok guzel");
        sb.reverse();
        System.out.println(sb);


        //2. YOl

        String str = "Hava cok guzel";

        for (int i = str.length()-1; i >= 0; i--) {
            char ch  = str.charAt(i);
            System.out.print(ch);
        }
        System.out.println();

        reverse(str);
    }

    public static void reverse(String str){
        String[] arr = str.split("");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}
