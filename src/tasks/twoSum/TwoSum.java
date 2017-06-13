/*
Цель задачи просканировать массив, в нем найти два элемента, которые в сумме равны числу target и вернуть новый массив в котором хранятся индексы найденых чисел.
*/
package tasks.twoSum;

import java.util.Arrays;

public class TwoSum {

    static int [] nums = {5, 2, 5, 11};
    static int target = 13;

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] nums1 = new int[2];
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        nums1[0] = i;
                        nums1[1] = j;
                        return nums1;
                    }
                }
            }
        return nums1;
    }
}
