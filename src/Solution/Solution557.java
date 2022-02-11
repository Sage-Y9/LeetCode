package Solution;

/**
 * @author yangjk
 * @date 2022/2/11 14:19
 */
public class Solution557 {
    public static String reverseWords(String s) {
//        StringBuilder res = new StringBuilder();
//        int i = 0;
//        while (i < s.length()) {
//            int start = i;
//            while (i < s.length() && s.charAt(i) != ' ') {
//                i++;
//            }
//            for (int j = i; j > start; j--) {
//                res.append(s.charAt(j - 1));
//            }
//            while (i < s.length() && s.charAt(i) == ' ') {
//                i++;
//                res.append(" ");
//            }
//        }
//        return res.toString();

        char[] chars = s.toCharArray();
        int left = 0, right = 0;
        while (right <= chars.length) {
            if (right == chars.length || chars[right] == ' ') {
                for (int i = 0; i < (right - left) / 2; i++) {
                    char temp = chars[left + i];
                    chars[left + i] = chars[right - i - 1];
                    chars[right - i - 1] = temp;
                }
                left = right + 1;
            }
            right++;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("God Ding"));
    }
}
