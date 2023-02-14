package Soru_71;


public class Runner {
    public static void main(String[] args) {
        C2 obj1 = new C1() ;
       I obj2 = new C1 () ;
       C2 s = (C2) obj2;//CTE
     //  I t = (I) obj1;//CTE


        C2 k = (C2) obj2;
        I t = (I) obj1;
        t.display() ;
      //  k.displayC2();
    }
}
