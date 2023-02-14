public class Soru_87 {
    int num;

    public static void graceMarks(Soru_87 obj4) {
        obj4.num += 10;
    }

    public static void main(String[] args) {
        Soru_87 obj1 = new Soru_87();
        Soru_87 obj2 = obj1;  // Local variable 'obj1' is redundant
        Soru_87 obj3 = null;
        obj2.num = 60;
        graceMarks(obj2);
        System.out.println(obj1.num);
        System.out.println(obj2.num);
        System.out.println("===================");
        graceMarks(obj1);
        System.out.println(obj1.num);
        System.out.println(obj2.num);
        System.out.println(obj2.hashCode());
        System.out.println(obj1.hashCode()); // obj1 ve obj2 ayni
//        System.out.println(obj3.hashCode());  // NullPointerException verir. null degerinin memoryde yeri yoktur
        System.out.println(obj3);
        int x = 5;
        a(x);
        System.out.println("x = " + x);
    }

    static void a(int a) {
        a += 5;
        System.out.println(a);
    }
}
