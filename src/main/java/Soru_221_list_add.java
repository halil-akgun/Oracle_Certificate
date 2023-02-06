import java.util.ArrayList;
import java.util.List;

public class Soru_221_list_add {
    public static void main(String[] args) {
        List colors = new ArrayList();
        colors.add("green");
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        colors.remove(2);
        System.out.println(colors);
        colors.add(4, "cyan");
        System.out.print(colors);
        // index 3 sona ek yapacagindan hata vermedi ama 4 yazsak IndexOutOfBoundsException aliriz

    }
}
