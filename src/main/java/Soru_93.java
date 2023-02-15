public class Soru_93 {

    int id;
    String name;

    public Soru_93(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public static void main(String[] args) {
        Soru_93 pl = new Soru_93(101, "Pen");
        Soru_93 p2 = new Soru_93(101, "Pen");
        Soru_93 p3 = pl;
        boolean ans1 = pl == p2;
        boolean ans2 = pl.name.equals(p2.name);
        System.out.println(ans1 + " " + ans2);
        System.out.println(p3==pl);
        p3.name="asd";
        System.out.println(p3==pl);
        System.out.println(pl.name);
    }
}
