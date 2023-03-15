package xdrush.leetcode.medium;

import xdrush.leetcode.common.ListNode;
import xdrush.leetcode.common.Utils;

/**
 * @author: XDRush <xudong_hust@126.com>
 * Created on 2023/2/16 18:57
 */

public class LeetCode0019 {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }

        ListNode tmpHead = head;
        int len = 0;
        while (tmpHead != null) {
            len += 1;
            tmpHead = tmpHead.next;
        }
        System.out.println("len = " + len);
        int step = len - n - 1;
        System.out.println("step = " + step);

        // 找到头了，直接返回头结点的下一个节点
        if (step < 0) {
            return head.next;
        }

        tmpHead = head;
        while (step > 0) {
            tmpHead = tmpHead.next;
            step -= 1;
        }
        System.out.println("val = " + tmpHead.val);

        if (tmpHead.next != null) {
            tmpHead.next = tmpHead.next.next;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode head = Utils.constructListNode();
        ListNode tmp = removeNthFromEnd(head, 1);
        while (tmp != null) {
            System.out.println(tmp.val);
            tmp = tmp.next;
        }
    }
}
