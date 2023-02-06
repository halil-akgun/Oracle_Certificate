public class soru_15 {

    public static void main(String[] args) {

        StringBuilder sbl = new StringBuilder("Duke");
        String str1 = sbl.toString();
        // insert code here
        String str2 = str1;

       // String str2 = sbl. toString();
        System.out.print(str1 == str2);
        str1="qwe";
        System.out.print(str1 == str2);

    }
}
