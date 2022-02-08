package Solution;

import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangjk
 * @date 2022/2/8 14:48
 */
public class Solution94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }

    public void inorder(TreeNode node, List<Integer> res) {
        if (node == null) {
            return;
        }
        inorder(node.left, res);
        res.add(node.val);
        inorder(node.right, res);
    }
}
