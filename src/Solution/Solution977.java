package Solution;

import java.util.Arrays;

/**
 * @author yangjk
 * @date 2022/2/9 10:10
 */
public class Solution977 {
    public static int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        // 双指针，根据负数越小平方越大，正数越大平方越大的特性，每次比较数组左右边界的元素的平方大小，把较大的结果逆序放入结果数组中
        for (int i = 0, j = nums.length - 1, currentIndex = nums.length - 1; i <= j; ) {
            int powLeft = nums[i] * nums[i];
            int powRight = nums[j] * nums[j];
            if (powLeft > powRight) {
                res[currentIndex] = powLeft;
                i++;
            } else {
                res[currentIndex] = powRight;
                j--;
            }
            currentIndex--;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-7, -3, 2, 3, 11};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
}
