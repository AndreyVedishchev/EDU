package tasks.twoSum;
/*есть массив с числами, и чило taget, тебе нужно просканировать массив и найти такие два числа, что бы их сумма давала target
при этом, по условию, всегда есть 1 решение и использовать один и тот же элемент дважды нельзя
а в качестве ответа функция должно вернуть номера элменетов массива
т.е. тех элементов, ктороые удовлетворяют условию nums[i] + nums[j] == target
ответом будет массив {i,j}*/

public class TwoSum {

    static int [] nums = {2, 7, 11, 15};
    static int target = 9;



    public static void main(String[] args) {
        twoSum(nums, target);
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] nums1 = new int[2];
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        System.out.println(nums[i] + " " + nums[j]);
                    }
                }break;
            }
        return nums1;
    }
}
