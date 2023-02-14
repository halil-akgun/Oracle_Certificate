public class Soru_107_Boolean {

    public static void main(String[] args) {

        boolean a = new Boolean(Boolean.valueOf (args [0]));//1-->False
        boolean b = new Boolean(args[1]);//null-->False
        System.out.println(a + " " + b);
      //  a("1",null);

    }
    static void a(String a, String b){

        /*
        Parses the string argument as a boolean.
         The boolean returned represents the value true
         if the string argument is not null and is equal, ignoring case, to the string "true".
          Otherwise, a false value is returned, including for a null argument.
           Example: Boolean.parseBoolean("True") returns true. Example: Boolean.parseBoolean("yes") returns false.
         */

        boolean q = new Boolean(Boolean.valueOf (a));
        boolean w = new Boolean(b);
        System.out.println(q + " " + w);
    }
}
