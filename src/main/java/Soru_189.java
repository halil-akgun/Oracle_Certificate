public class Soru_189 {

    public static int stVar = 100;
    public int var = 200;
    public String toString(){
        return stVar + ":" + var;

    }


    public static void main(String[] args) {

        Soru_189 tl = new Soru_189 ();
        tl.var = 300;
        System.out.println(tl);
        Soru_189 t2 = new Soru_189 ();
        t2.stVar = 300;
        System.out.println(t2);

 }

}