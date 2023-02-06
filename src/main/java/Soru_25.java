import java.util.Arrays;

public class Soru_25 {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {1, 2, 3, 4, 5};
        nums2 = nums1;
        System.out.println(Arrays.toString(nums2));
        for (int x : nums2){
            System. out. print (x + ":");
        }
        System.out.println(nums1==nums2);
        nums1[1]=5;
        System.out.println(nums1==nums2);
        System.out.println(Arrays.toString(nums2));


    }



}
