package Interview_Q;

import java.util.ArrayList;

public class Soru_15 {

    // Part1:
    // Create an arraylist of Strings
    // add - "Red", "Green", "Blue", "Yellow" and "Black" inside
    // print out all the elements, each element on new line

    // Part2:
    // Create a method that accepts a String arraylist and a String as parameters
    // method should add the element at the first index of arraylist

    // Part3:
    // Create a method that accepts a String arraylist and a String as parameters
    // it should add element before last element
    // ex:  [1, 2, 3]  -> [1, 2, 4, 3]


    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");
        list.add("Black");

        for (String s : list) {
            System.out.println(s);
        }

        add(list,"Gece");
        addd(list,"gunduz");

    }

    public static void add(ArrayList<String> lits, String s){
        lits.add(0,s);
        System.out.println(lits);

    }
    public static void  addd(ArrayList<String> list, String a){

        list.add(list.size()-1,a);
        System.out.println(list);

    }


}
