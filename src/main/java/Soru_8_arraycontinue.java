public class Soru_8_arraycontinue {

    public static void main(String[] args) {

        String[] [] arr = {{"A","B","Z"},{"D","E"}};
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.println(arr[i][j]+" ");
                if (arr[i][j].equals("B")) {
                    continue;
                }

            }
            continue;
        }

    }

}
