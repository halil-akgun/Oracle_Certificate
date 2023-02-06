package Interview_Q;

public class Soru_20 {
    //Get String from user and print just vowels(aeiou) inside String on the console

    public static void main(String[] args) {

        String str = "batman is beautiful";
        String vowels = "aeiou";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (vowels.contains(String.valueOf(str.charAt(i))) && !result.contains(String.valueOf(str.charAt(i)))) {
                result+= str.charAt(i) + " ";
            }
        }
        System.out.println(result);
    }
}
