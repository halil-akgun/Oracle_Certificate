public class Soru_74 {


    void readCard(int cardNo) throws Exception {
        System.out.println("Reading Card");
    }

    void checkCard(int cardNo) throws RuntimeException { // line nl
        System.out.println("Checking Card");
    }

    public static void main(String[] args) {
        Soru_74 ex = new Soru_74();
        int cardNo = 12344;
        //ex.readCard(cardNo); //line n2  hata
        ex.checkCard(cardNo); //line n3

    }
}
