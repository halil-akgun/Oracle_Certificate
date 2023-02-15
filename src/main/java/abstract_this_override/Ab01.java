package abstract_this_override;

public abstract class Ab01 {
        public int sayi = 10;

        public abstract void set(int a);

        abstract void get();
        final Ab01 deneme(Ab01 a){
            System.out.println("a.sayi = " + a.sayi);
            return a;
        }
    }
