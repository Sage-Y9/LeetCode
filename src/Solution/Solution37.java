package Solution;

/**
 * @author yangjk
 * @date 2021/7/1 10:55
 */
public class Solution37 {
    public int searchInsert(int[] nums, int target) {
        if (nums.length <= 0) {
            return 0;
        }
        int index = 0;
        while (index < nums.length) {
            if (target <= nums[index]) {
                break;
            }
            index++;
        }
        return index;
    }
}
