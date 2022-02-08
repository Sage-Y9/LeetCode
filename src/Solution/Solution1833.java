package Solution;

import java.util.Arrays;

/**
 * @author yangjk
 * @date 2021/7/2 14:24
 */
public class Solution1833 {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0;
        for (int cost : costs) {
            if (cost <= coins) {
                coins -= cost;
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
