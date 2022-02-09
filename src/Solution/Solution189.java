package Solution;

import java.util.Arrays;

/**
 * @author yangjk
 * @date 2022/2/9 10:38
 */
public class Solution189 {
    public static void rotate(int[] nums, int k) {
        reverse(nums, 0, nums.length - 1);
        k %= nums.length;
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {-1, -100, 3, 99};
        rotate(nums, 2);
        System.out.println(Arrays.toString(nums));
    }
}
