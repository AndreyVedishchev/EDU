package tasks.twoSum;

import java.util.Arrays;

public class TwoSum {

    static int [] nums = {2, 7, 11, 15};
    static int target = 9;

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] nums1 = new int[2];
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        nums1[0] = i;
                        nums1[1] = j;
                    }
                }break;
            }
        return nums1;
    }
}
