public class Soru_117 {
    public static void main(String[] args) {
        String ta = null;
        ta = ta.concat("B ");
        String tb = "Z ";
        ta.concat(tb);
        ta.replace('Z', 'D');
        ta = ta.concat(tb);
        System.out.println(ta);
    }
}
