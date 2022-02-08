package Solution;

/**
 * @author yangjk
 * @date 2021/7/1 15:52
 */
public class Solution58 {
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() < 1) {
            return 0;
        }
        int length = 0;
        int endIndex = s.length() - 1;
        for (int i = endIndex; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (length == 0) {
                    continue;
                }
                break;
            }
            length++;
        }
        return length;
    }
}
