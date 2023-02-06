package Interview_Q;

public class Soru_1 {

/*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
    */
    public static void main(String[] args) {

        String str = "Batman is beautiful";
        String sonuc = " ";

        int sayac =0;
        for (int i =0; i<str.length();i++){
            char ch = str.charAt(i);
                  sayac=0;
                  if (ch==' '){
                      continue;
                  }
            for (int j = i; j < str.length(); j++) {

                if (!str.substring(0,i).contains(String.valueOf(ch))){
                    if (ch==str.charAt(j)){
                        sayac++;
                    }
                }
            }
          if(sayac!=0){
                sonuc+=" "+str.charAt(i)+sayac+" ";
                //System.out.println(str.charAt(i)+" harfi "+ sayac+" defa tekrarlidir.");
            }

        }
        System.out.println(sonuc);

    }


}
