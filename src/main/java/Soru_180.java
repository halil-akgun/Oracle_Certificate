public class Soru_180 {
    public static String maskCC(String creditcard) {
        String x = "XXXX-XXXX-XXXX-";
        StringBuilder sb = new StringBuilder(creditcard);
        StringBuilder s = sb.insert(0, x);
        return s.toString();
    }
    public static void main(String[] args) {
        System.out.println(maskCC("1234-5678-9101-1121") ) ;

    }


}
