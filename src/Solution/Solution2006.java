package Solution;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yangjk
 * @date 2022/2/9 14:12
 */
public class Solution2006 {
    public static int countKDifference(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int num : nums) {
            count += map.getOrDefault(num - k, 0) + map.getOrDefault(num + k, 0);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 4};
        System.out.println(countKDifference(nums, 2));
    }
}
