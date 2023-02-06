import java.util.ArrayList;
import java.util.List;

public class Soru_199 {


    public static void main(String[] args) {

        String stuff = "TV";
        String res = null;
        res = stuff.equals ("TV") ?  "Walter" : stuff.equals("Movie") ?  "White" :"No Result";

        res = stuff.equals ("TV") ? stuff.equals ("Movie")? "Walter" : "White" : "No Result";

        List d = new ArrayList<>();
        d.add(1);
        d.add("1q");
        System.out.println(d);

    }
}
