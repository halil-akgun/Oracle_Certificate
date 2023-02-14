package soru_177_parentChild;

public class Peacock extends Bird {


    public static void dance() {
        System.out.print("Dance.");
    }

    public static void main(String[] args) {
////        Bird b = new Bird();
////        Peacock p = (Peacock) b;
//        Bird b = new Peacock();
//        Peacock p = (Peacock) b;
//        p.fly();
//        p.dance();

//        Bird r = new Peacock();
//        Peacock d = (Peacock) r;
//        d.fly();
//        d.dance();

        Peacock b = new Peacock ();
        Bird p = (Bird) b;
        p.fly();


    }

}
