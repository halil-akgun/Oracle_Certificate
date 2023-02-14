public class Soru_22_trycatch {

    public static void main(String[] args) {
      int ans;
        try {
            int num = 10;
            int div = 0;
            ans = num / div;
        } catch (ArithmeticException ae) {
            ans =0; // line nl
        } catch (Exception e) {
            System.out.println("Invalid calculation");
        }


      // System.out.println("Answer = " + ans);// atama {} icinde yapildigindan burda degeri goremiyor
                                              //Variable 'ans' might not have been initialized.
        // line n2




    }


}
