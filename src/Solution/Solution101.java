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

    // 如果左右子树都为空，则为对称，一个子树为空，另一个子树不为空，则不是对称，都不为空都话再对左子树的右子树和右子树的左子树进行比较
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
