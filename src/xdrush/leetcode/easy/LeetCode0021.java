package xdrush.leetcode.easy;

/**
 * Copyright (c) 2017 XiaoMi Inc. All Rights Reserved.
 *
 * @author: wangwenjie <wangwenjie1@xiaomi.com>
 * Created on 2021/3/9
 */

public class LeetCode0021 {
     public static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = null;

        ListNode p1 = l1;
        ListNode p2 = l2;
        while (p1.next != null || p2.next != null) {
            ListNode temp = new ListNode();
            if (p1.val <= p2.val) {
                p1 = p1.next;
                temp = p1;
                if (result == null) {
                    result = temp;
                } else {
                    result.next = temp;
                }
            } else {
                p2 = p2.next;
                temp = p2;
                if (result == null) {
                    result = temp;
                } else {
                    result.next = temp;
                }
            }
        }
        return result;
    }
}
