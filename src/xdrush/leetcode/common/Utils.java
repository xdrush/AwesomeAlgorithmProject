package xdrush.leetcode.common;

/**
 * @author: XDRush <xudong_hust@126.com>
 * Created on 2023/2/7 20:56
 */

public class Utils {
    public static TreeNode constructTree()  {
        TreeNode root = new TreeNode(1);
        TreeNode left1 = new TreeNode(2);
        TreeNode right1 = new TreeNode(3);
        root.left = left1;
        root.right = right1;

        TreeNode left11 = new TreeNode(4);
        TreeNode left12 = new TreeNode(5);
        left1.left = left11;
        left1.right = left12;

        TreeNode right11 = new TreeNode(6);
        TreeNode right12 = new TreeNode(7);
        right1.left = right11;
        right1.right = right12;

        return root;
    }

    public static ListNode constructListNode() {
        ListNode head = new ListNode(1);
        /*ListNode next1 = new ListNode(2);
        // head.next = next1;
        ListNode next2 = new ListNode(3);
        ListNode next3 = new ListNode(4);
        ListNode next4 = new ListNode(5);
        ListNode next5 = new ListNode(6);

        head.next = next1;
        next1.next = next2;
        next2.next = next3;
        next3.next = next4;
        next4.next = next5;
        next5.next = null;*/

        return head;
    }
}
