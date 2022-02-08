package Solution;

import java.util.Arrays;

/**
 * @author yangjk
 * @date 2022/2/8 14:27
 */
public class Solution88 {
    // 逆向双指针，比较nums1和nums2最后一个元素的大小，从nums1的末尾开始放入
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m - 1, q = n - 1, currentIndex = nums1.length - 1, currentValue;
        while (p >= 0 || q >= 0) {
            if (p == -1) {
                currentValue = nums2[q--];
            } else if (q == -1) {
                currentValue = nums1[p--];
            } else if (nums1[p] > nums2[q]) {
                currentValue = nums1[p--];
            } else {
                currentValue = nums2[q--];
            }
            nums1[currentIndex--] = currentValue;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
}
