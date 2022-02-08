package Solution;

/**
 * @author yangjk
 * @date 2022/2/7 17:23
 */
public class Solution70 {
    public static int climbStairs(int n) {
        // 和Fibonacci数组类似，f(x)只与f(x-1)和f(x-2)相关，维护这两个的爬楼梯情况数量即可
        int p, q = 0, r = 1;
        for (int i = 0; i < n; i++) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(45));
    }
}
