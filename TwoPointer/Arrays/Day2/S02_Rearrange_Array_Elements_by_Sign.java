import java.util.*;

public class  S02_Rearrange_Array_Elements_by_Sign {

    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int posIdx = 0, negIdx = 1;

        for(int i=0; i<n; i++) {
            if(nums[i] > 0) {
                res[posIdx] = nums[i];
                posIdx += 2;
            } else {
                res[negIdx] = nums[i];
                negIdx += 2;
            }
        }

        return res;
    }

    public static void main(String args[]) {

        int[] nums = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }
}