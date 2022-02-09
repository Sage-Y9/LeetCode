package Solution;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangjk
 * @date 2022/2/9 14:37
 */
public class Solution118 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) {
                    row.add(1);
                } else {
                    row.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
            }
            result.add(row);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(generate(3));
    }
}
