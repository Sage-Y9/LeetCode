package Solution;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangjk
 * @date 2022/2/10 15:19
 */
public class Solution1447 {
    public static List<String> simplifiedFractions(int n) {
        List<String> res = new ArrayList<>();
        for (int denominator = 2; denominator <= n; denominator++) {
            for (int numerator = 1; numerator < denominator; numerator++) {
                if (gcd(numerator, denominator) == 1) {
                    res.add(numerator + "/" + denominator);
                }
            }
        }
        return res;
    }

    //最大公约数
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(simplifiedFractions(6));
    }
}
