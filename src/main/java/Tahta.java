public class Tahta {


        public static void main(String[] args) {

            int wd=0;
            String days[]={"paz","pt","car","per"};
            for(String s:days){
                switch (s){
                    case "per":
                    case "paz":
                        wd-=1;
                        break;
                    case "pt":
                        wd++;
                    case "car":
                        wd+=2;
                }
            }
            System.out.println(wd);

        }
}
