import java.util.Arrays;

/**
 * @author yangjk
 * @date 2021/7/16 17:35
 */
public class Solution34 {
    public static int[] searchRange(int[] nums, int target) {
        int left = binarySearch(nums, target - 1);
        int right = binarySearch(nums, target) - 1;
        if (left <= right && right <= nums.length && nums[left] == target && nums[right] == target) {
            return new int[]{left, right};
        } else {
            return new int[]{-1, -1};
        }
    }

    public static int binarySearch(int[] nums, int target) {
        int index = nums.length;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
                index = mid;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(nums, 8)));
    }
}
