public class Soru_135 {
    public String name;
    public int moons;

    public Soru_135(String name, int moons) {
        this.name = name;
        this.moons = moons;
    }


    public static void main(String[] args) {
        Soru_135[] Soru_135s = {
                new Soru_135("Mercury", 0),
                new Soru_135("Venus ", 0),
                new Soru_135("Earth", 1),
                new Soru_135("Mars", 2)
        };
        System.out.println(Soru_135s);
        System.out.println(Soru_135s[2].name);
        System.out.println(Soru_135s[2].moons);
    }
}

