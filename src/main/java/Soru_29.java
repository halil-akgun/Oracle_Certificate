import java.util.ArrayList;

public class Soru_29 {
    public static void main(String[] args) {
            ArrayList<Integer> points = new ArrayList<>();
            points.add(1) ;
            points.add(2) ;
            points.add(3) ;
            points.add(4) ;
            points.add(null);// Non- primitve datalarin default degeri "null" dir
            points. remove(1) ;

            points.remove(null) ;
            System.out.println(points);
    }
}
