package tasks.removeDuplicates;

import java.util.Arrays;

public class Solution {
    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }



    public static void main(String[] args) {//не создавая новый массив, удалить дубликаты

        int []arr = new int[7];

        arr[0] = 0;
        arr[1] = 0;
        arr[2] = 1;
        arr[3] = 0;
        arr[4] = -1;
        arr[5] = 3;
        arr[6] = 3;


        System.out.println(Arrays.toString(arr));
        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }
}
