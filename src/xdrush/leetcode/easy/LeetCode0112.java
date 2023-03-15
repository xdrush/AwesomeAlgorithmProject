package xdrush.leetcode.easy;

import xdrush.leetcode.common.TreeNode;
import xdrush.leetcode.common.Utils;

/**
 * Copyright (c) 2017 XiaoMi Inc. All Rights Reserved.
 *
 * @author: wangwenjie <wangwenjie1@xiaomi.com>
 * Created on 2023/2/7
 */

public class LeetCode0112 {

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }

        return hasPathSum(root.left, targetSum - root.val) ||
                hasPathSum(root.right, targetSum - root.val);
    }

    public static void main(String[] args) {
        System.out.println(hasPathSum(Utils.constructTree(), 12));
    }
}
