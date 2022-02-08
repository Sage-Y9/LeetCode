package Solution;

import DataStructure.ListNode;

/**
 * @author yangjk
 * @date 2022/2/8 14:08
 */
public class Solution83 {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.val == currentNode.next.val) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, null)))));
        System.out.println(deleteDuplicates(node).toString());
    }
}
