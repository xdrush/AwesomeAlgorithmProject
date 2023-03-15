package xdrush.leetcode.medium;

import xdrush.leetcode.common.TreeNode;
import xdrush.leetcode.common.Utils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: XDRush <xudong_hust@126.com>
 * Created on 2023/2/8 10:18
 */

@SuppressWarnings("all")
public class LeetCode0113 {
    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        if (root == null) {
            return result;
        }

        dfs(result, tmp, root, targetSum);
        return result;
    }

    private static void dfs(List<List<Integer>> result, List<Integer> tmp, TreeNode root, int targetSum) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            tmp.add(root.val);
            if (equal(tmp, targetSum)) {
                result.add(new LinkedList<>(tmp));
            }
            tmp.remove(tmp.size() - 1);
            return;
        }

        tmp.add(root.val);
        dfs(result, tmp, root.left, targetSum);
        dfs(result, tmp, root.right, targetSum);
        tmp.remove(tmp.size() - 1);
    }

    private static boolean equal(List<Integer> list, int targetSum) {
        int sum = 0;
        for (Integer data: list) {
            sum += data;
        }
        return sum == targetSum;
    }

    public static void main(String[] args) {
        List<List<Integer>> res = pathSum(Utils.constructTree(), 10);
        for (List<Integer> list: res) {
            String str = "";
            for (Integer ele: list) {
                if (str.isEmpty()) {
                    str = String.valueOf(ele);
                } else {
                    str += "," + String.valueOf(ele);
                }
            }
            System.out.println(str);
        }
    }
}
