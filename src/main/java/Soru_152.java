import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Soru_152 {
    public static void main(String[] args) {
        List<String> lst = Arrays.asList("A", "B", "Z", "D");
        Iterator<String> itr = lst.iterator();
        while (itr.hasNext()) {
            String e = itr.next();
            if (e == "Z") {
                break;
            } else {
                //continue;
                System.out.print(e);
            }
        }
    }
}
