
public class Soru_165 {
    String s;
    public boolean equals(Soru_165 str) {
        return this.s.equalsIgnoreCase(str.toString());
    }
    Soru_165(String s) {
        this.s = s;
    }

    public static void main(String[] args) {
        String s1 = "Moon";
        Soru_165 s2 = new Soru_165("Moon");
        if ((s1 == "Moon") && (s2.equals("Moon"))) {
            System.out.print("A");
        } else {
            System.out.print("B");
        }
        if (s1.equalsIgnoreCase(s2.s)) {
            System.out.print("C");
        } else {
            System.out.print("D") ;
        }
    }
}
