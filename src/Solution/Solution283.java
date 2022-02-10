package Solution;

import java.util.Arrays;

/**
 * @author yangjk
 * @date 2022/2/10 10:22
 */
public class Solution283 {
    public static void moveZeroes(int[] nums) {
        int current = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[current] = nums[i];
                current++;
            }
        }
        while (current < nums.length) {
            nums[current] = 0;
            current++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
