package Solution;

import DataStructure.TreeNode;

/**
 * @author yangjk
 * @date 2022/2/8 17:26
 */
public class Solution108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return generate(nums, 0, nums.length - 1);
    }

    public TreeNode generate(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = generate(nums, left, mid - 1);
        node.right = generate(nums, mid + 1, right);
        return node;
    }
}
