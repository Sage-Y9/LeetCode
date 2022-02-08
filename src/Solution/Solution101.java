package Solution;

import DataStructure.TreeNode;

/**
 * @author yangjk
 * @date 2022/2/8 17:34
 */
public class Solution101 {
    public boolean isSymmetric(TreeNode root) {
        return isSame(root.left, root.right);
    }

    public boolean isSame(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        } else {
            return p.val == q.val && isSame(p.left, q.right) && isSame(p.right, q.left);
        }
    }
}
