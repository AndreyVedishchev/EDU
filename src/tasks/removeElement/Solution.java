package tasks.removeElement;

import java.util.Arrays;

public class Solution {
    public static int removeElement(int[] nums, int val) {

        int l = nums.length;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == val) {
                nums[i] = 0;
                l--;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[j] > 0) {
                    int t = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = t;
                }
            }
        }

        return l;
    }

    public static void main(String[] args) {//без создания нового массива удалить из массива все объекты со значение val

        int arr[] = {3,2,2,3};

        System.out.println(Arrays.toString(arr));
        System.out.println(removeElement(arr, 3));
        System.out.println(Arrays.toString(arr));
    }
}
