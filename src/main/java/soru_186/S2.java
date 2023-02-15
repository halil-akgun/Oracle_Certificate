package soru_186;

public class S2 extends S1{


   public void display(int x) {
        System.out.println("Child" + x) ;
    }

    public void display(int x, int y) {
        this.display(x);
        display(y);
        super.display(y);


    }


    public static void main(String[] args) {

        S2 sobj = new S2(); sobj.display(10, 100);
    }
}
