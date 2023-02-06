package Soru_174_stringbuilder;

public class Test {
//     int a = 0;
//    static void c(){
//        a=1;
//    }
    public static void main(String[] args) {
        System.out.println("Hello " + new StringBuilder());
        System.out.println("Hello " + new MyString("Java SE 8").msg);
        System.out.println("Hello " + new MyString("Java SE 8"));

//        StringBuilder a = new StringBuilder();
//        System.out.println(a.hashCode());
        String b = new String("hgigi");
        System.out.println(b);
    }
}
