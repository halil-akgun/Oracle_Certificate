package Soru_71;

import Soru_68.Test;

public class Runner {
    public static void main(String[] args) {
        C2 obj1 = new C1() ;
       I obj2 = new C1 () ;
       //C2 s =  obj2;//CTE
//        I t = obj1;CTE


       // C2 s = (C2) obj2;
        I t = (I) obj1;
        t.display() ;
      //  s.displayC2();
    }
}
