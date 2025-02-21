import java.util.*;

public class S03_SortArrayByParity {

    public static int[] sortArrayByParity(int[] nums) {
        int left = 0; 
        int right = nums.length - 1;

        while(left < right) {
            if(nums[left] % 2 == 0) {
                left++;
            } else if(nums[right] % 2 == 1) {
                right--;
            }

            else {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }

        return nums;
    }

    public static void main(String args[]) {

        int[] nums = {3,1,2,4};
        System.out.println("Sorted Array : " + Arrays.toString(sortArrayByParity(nums)));

        // with void
        // sortArrayByParity(nums);
        // System.out.println(Arrays.toString(nums));
    }
}