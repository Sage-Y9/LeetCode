package Solution;

import DataStructure.TreeNode;

/**
 * @author yangjk
 * @date 2022/2/9 13:57
 */
public class Solution112 {
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}
