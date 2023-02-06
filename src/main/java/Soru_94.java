public class Soru_94 {
    String name;
    int age = 25;
    Soru_94(String name) { // line nl
        setName(name);
    }
    public Soru_94(String name, int age) {
       // Soru_94(name); // line n2 this(name)
        setAge(age);
    }

    public String show() {
        return name + " " + age;
    }
    public static void main(String[] args) {
        Soru_94 pl = new Soru_94("Jesse");
        Soru_94 p2 = new Soru_94("Walter",52);
        System.out.println(pl.show());
        System.out.println(p2.show());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
