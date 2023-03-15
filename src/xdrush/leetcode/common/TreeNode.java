package xdrush.leetcode.common;

/**
 * @author: XDRush <xudong_hust@126.com>
 * Created on 2023/2/7 20:45
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {}
    public TreeNode(int val) {this.val = val;}
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

