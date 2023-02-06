import java.util.function.Predicate;

public class Soru_210_predicate {

    public static void main(String[] args) {


        Predicate<Integer> p = (n) -> n % 2 == 0;
        boolean a = p.test(100);
        System.out.println(a);
//
//        Integer s = p.test(100);
//        if (s == 1) {
//            System.out.println("false");
//        } else {
//            System.out.println("true");
//
//        }


       // System.out.println(p.apply(100));
    }
}
