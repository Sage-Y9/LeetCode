/**
 * @author yangjk
 * @date 2021/7/1 15:34
 */
public class Solution53 {
    public int maxSubArray(int[] nums) {
        int pre = 0;
        int max = nums[0];
        for (int num : nums) {
            //遍历找出连续最大和的子数组
            //假如前面子数组与当前元素的相加比当前元素大，则记录最大子数组的和为pre + num，否则从当前元素num开始记录
            pre = Math.max(pre + num, num);
            //把当前子数组大和与最大值值相比，取大值
            max = Math.max(pre, max);
        }
        return max;
    }
}
