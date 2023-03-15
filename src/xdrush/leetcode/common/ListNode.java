package xdrush.leetcode.common;

/**
 * @author: XDRush <xudong_hust@126.com>
 * Created on 2023/2/16 18:51
 */

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) {
        this.val = val;
    }
    public ListNode(int val, ListNode node) {
        this.val = val;
        this.next = node;
    }
}
