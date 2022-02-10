package Solution;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangjk
 * @date 2022/2/9 17:03
 */
public class Solution119 {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            row.add((int) ((long) row.get(i - 1) * (rowIndex - i + 1) / i));
        }
        return row;
    }

    public static void main(String[] args) {
        System.out.println(getRow(5));
    }
}
