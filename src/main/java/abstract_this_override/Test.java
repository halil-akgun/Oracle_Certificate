package abstract_this_override;

public class Test extends Ab01 {

    public void set(int a) {
        this.sayi = a;
    }

    @Override
    void get() {

    }

    public static void main(String[] args) {
        Test obj = new Test();
        obj.set(20);
        System.out.println(obj.sayi);

        Ab01 obj2 = new Test();
        System.out.println("main: " + obj2.deneme(obj2).sayi);
    }
}
