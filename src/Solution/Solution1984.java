package Solution;

import java.util.Arrays;

/**
 * @author yangjk
 * @date 2022/2/11 10:50
 */
public class Solution1984 {
    public static int minimumDifference(int[] nums, int k) {
        if (nums.length <= 1) {
            return 0;
        }
        //因为是随机选k个数，可以先把数组排序后，利用滑动窗口，计算左右边界的差值
        Arrays.sort(nums);
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i <= nums.length - k; i++) {
            if (nums[i + k - 1] - nums[i] < minimum) {
                minimum = nums[i + k - 1] - nums[i];
            }
        }
        return minimum;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{87063, 61094, 44530, 21297, 95857, 93551, 9918};
        System.out.println(minimumDifference(nums, 6));
    }
}
