package Solution;

/**
 * @author yangjk
 * @date 2022/2/9 10:00
 */
public class Solution278 {
    public static int firstBadVersion(int n) {
        int left = 1, right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static Boolean isBadVersion(int version) {
        return version == 4;
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }
}
