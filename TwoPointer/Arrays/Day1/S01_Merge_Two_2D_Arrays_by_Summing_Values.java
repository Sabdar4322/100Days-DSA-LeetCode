import java.util.*;

public class S01_Merge_Two_2D_Arrays_by_Summing_Values {

    public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int i=0, j=0;
        List<int[]> result = new ArrayList<>();

        while(i < nums1.length && j < nums2.length) {
            if(nums1[i][0] == nums2[j][0]) {
                result.add(new int[]{nums1[i][0], nums1[i][1]+nums2[j][1]});
                i++; 
                j++;
            } else if(nums1[i][0] < nums2[j][0]) {
                result.add(nums1[i]);
                i++;
            } else {
                result.add(nums2[j]);
                j++;
            }
        }

        while(i < nums1.length) {
            result.add(nums[i]);
            i++;
        }

        while(j < nums2.length) {
            result.add(nums2[j]);
            j++;
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String args[]) {

        int[] nums1 = {{1,2},{2,3},{4,5}};
        int[] nums2 = {{1,4},{3,2},{4,1}};

        System.out.println(mergeArrays(nums1, nums2));
    }
}