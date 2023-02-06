package interfac;

public interface A {
     public static final int a =2;
     int b =2;
     int b1 =3000;


    private   static  int myMethodd() {
        return 12;
    }
    // Body'li methodlar ya varsayilan olarak public'tir. private ta olabilir.

//    public default int myMethoddf() {
//        return 12;
//    }
    //Interface'ler body'si olan methodlara sahip olabilir ama bu metholar default yada static olmak zorundadir
    // default bir keyword'tur Access modifier'la bir ilgisi yoktur.
    //

     int myMethod();

}
