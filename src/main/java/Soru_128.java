public class Soru_128 {

        int x;
        int y;
        public void doStuff(int x, int y) {
            x = x;
            y = this.y;
        }
        public void display () {
            System.out.print(x + " " + y + " : ");
        }
            public static void main(String[] args) {
                Soru_128 ml = new Soru_128();
                ml.x = 100;
                ml.y = 200;
                Soru_128 m2 = new Soru_128();
                m2.doStuff(ml.x, ml.y);
                ml.display();
                m2 .display();
            } // 100 200 : 0 0 :

        }
