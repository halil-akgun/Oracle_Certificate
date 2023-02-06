package soruu_200;

import java.util.ArrayList;
import java.util.List;

public class Test {


    public static void main(String[] args) {


        List ps = new ArrayList();
        Patient p2 = new Patient ("Mike");
        ps.add(p2);
//        System.out.println(ps.indexOf(p2));//0
//
//
//        int f = ps.indexOf (new Patient ("Mike") ;
//        System.out.println(f);//-1

        Patient p =new Patient("Mike");
        int  f= ps.indexOf(p);
        System.out.println(f);//-1



        if (f >= 0) {
            System.out.print ("Mike Found");
        }
    }


}
