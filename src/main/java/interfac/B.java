package interfac;

public class B implements C, A{

    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.myMethod());

        System.out.println(A.b1);


    }
    @Override
    public int myMethod() {
        return 0;
    }
}
