public class Soru_139 {
    int count;

    public static void displayMsg() {
//            System.out.println("Welcome Visit Count: " + count++); // Non-static field 'count' cannot be referenced from a static context
    }

    public static void main(String[] args) {
        Soru_139.displayMsg();
        displayMsg();



        }



}
