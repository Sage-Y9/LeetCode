package Solution;

import java.util.Arrays;

/**
 * @author yangjk
 * @date 2022/2/7 16:30
 */
public class Solution66 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = (digits[i] + 1) % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        Solution66 solution66 = new Solution66();
        int[] digits = new int[]{9, 9, 9};
        System.out.println(Arrays.toString(solution66.plusOne(digits)));
    }
}
