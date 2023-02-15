public class Soru_97 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        String s = "Java";
        if (sb.toString().equals(s.toString())) {
            System.out.println("Match 1");
        } else if (sb.equals(s)) {//false
            System.out.println("Match 2");
        } else {
            System.out.println("No Match");
        }


    }
}