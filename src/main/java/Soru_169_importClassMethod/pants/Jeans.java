package Soru_169_importClassMethod.pants;

import  Soru_169_importClassMethod.*;

public class Jeans {
    public void matchshirt() {
        String color = Shirt.getColor();  // line n2
        if (color.equals("Green")) {
            System.out.print("Fit");
        }
    }

    public static void main(String[] args) {
        Jeans trouser = new Jeans();
        trouser.matchshirt();
    }


}
