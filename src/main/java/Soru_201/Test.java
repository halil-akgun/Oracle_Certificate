package Soru_201;

public class Test {

    public static void main(String[] args) {

        Student[] students = new Student[3];
        students[1] = new Student("Richard");
        students[2] = new Student("Donald");
//        for (Student s : students) {
//            System.out.println("" + s.name);
//        }
        System.out.println(students[0]);// burada "null" dondurur. bos bir obje name ye ulasmaya
        System.out.println(students[0].name);// burada "nullPointerException" dondurur.
                                             // bos bir obje ile name ye ulasmaya calisiyorum.

//        for (int i = 0; i < students.length; i++) {
//            System.out.println(students[i].name);
//
//        }





    }


}
