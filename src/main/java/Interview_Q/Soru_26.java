package Interview_Q;

public class Soru_26 {


    public static void main(String[] args) {

/*
        There is a lonely monkey on the island
        He needs to eat 4 bananas every day
        there are just 165 bananas on that island
        Create following variables and find how many days
        monkey can survive.
                Use do while loop, increment and decrement and if statements


		*/
        int numberOfBananas =8, survivalDays = 0;
        boolean monkeyAlive = true;
        do {
            survivalDays++;
            numberOfBananas-=4;

            if (numberOfBananas<4){
                monkeyAlive=false;
                System.out.println(survivalDays+" hayatta kaldi ve obur gune oldu");
            }
        }while (monkeyAlive);






    }
}
