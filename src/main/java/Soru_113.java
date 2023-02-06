public class Soru_113 {
    private static int stock = 10;
    private static int qty;

    /*
    yapilmasi gereken islem istenilen cikti icin:
    //Sold:5 items. Stock in Hand: 5
    //Purchased:5 items. Stock in Hand: 10
1- stocku static yapmak
2- qty declare etmek
3- purchase ve sell metodlarinda this.qty olrak guncellemek
     */
    public void purchase(int qty) {
        this.qty=qty;
        stock += qty;}
    public void sell(int qty) {
        this.qty=qty;
        stock -= qty;}
    public void printstock(String action) {
        System.out.println(action + ":" + qty + " items. Stock in Hand: " + stock);
    }
    public static void main(String[] args) {

        Soru_113 kl = new Soru_113();
        kl.sell (5) ;
        kl.printstock("Sold");
        Soru_113 k2 = new Soru_113();
        k2.purchase(5);
        k2.printstock("Purchased");
    }
}
