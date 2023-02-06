import java.time.Period;

public class Soru_191_is_same_variables {
    private char var;

    public static void main(String[] args) {
        char varl = 'a';
        char var2 = varl;
        var2 = 'e';
//        int a = 1;
//        int b = a;
//        System.out.println(a==b);
//        b = 2;
//
//        String s ="a";
//        String t = s;
//        t="k";
//        System.out.println(s==t);
//        String a = new String();
//        String b = new String();
//        a=b;
//        b="k";
//        System.out.println(a==b);

        Soru_191_is_same_variables obj1 = new Soru_191_is_same_variables();
        Soru_191_is_same_variables obj2 =  obj1;
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        obj1.var = 'a';
        obj2.var = 'i';
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj1 == obj2);
        System.out.println(varl + ", " + var2);
        System.out.print(obj1.var + ", " + obj2.var);

    }
}