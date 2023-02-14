package soru_100.Test;


import soru_100.Acc.Acc;

public class Test extends Acc {
    public static void main(String[] args) {

        //Objenin  data type'ni Test yapinca method ve variabler gorundu.
        Test obj = new Test () ;

        System.out.println(obj.s);
        System.out.println(obj.r);
        obj.a();

        Acc obj1 = new Test () ;
        System.out.println(obj1.s);

//Neden protected varibaleye ulasamiyorum???
    }
}
