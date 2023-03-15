package xdrush.leetcode.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author: XDRush <xudong_hust@126.com>
 * Created on 2023/2/10 19:50
 * @reference: https://leetcode.cn/problems/generate-parentheses/solution/22-gua-hao-sheng-cheng-bao-li-fa-hui-su-fa-dong-ta/
 */

public class LeetCode0022 {

    private static boolean isValid(String tmpStr) {
        int balance = 0;
        for (int i = 0; i < tmpStr.length(); i++) {
            if ("(".equals(tmpStr.substring(i, i + 1))) {
                balance += 1;
            } else {
                balance -= 1;
            }

            if (balance < 0) {
                return false;
            }
        }

        return balance == 0;
    }

    private static void backtrack(List<String> result, String tmpStr, int n) {
        if (tmpStr.startsWith(")")) {
            return;
        }

        if ((tmpStr.length() == 2 * n)) {
            if (isValid(tmpStr)) {
                result.add(tmpStr);
            }
            return;
        }

        backtrack(result, tmpStr + "(", n);
        backtrack(result, tmpStr + ")", n);
    }

    private static void backtrack2(List<String> result, String tmpStr, int left, int right, int n) {
        if (tmpStr.length() == 2 * n) {
            result.add(tmpStr);
            return;
        }

        if (left < n) {
            backtrack2(result, tmpStr + "(", left + 1, right, n);
        }

        if (right < left) {
            backtrack2(result, tmpStr + ")", left, right + 1, n);
        }
    }

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        String tmpStr = "";
        backtrack(result, tmpStr, n);
        return result;
    }

    public static void main(String[] args) {
        List<String> res = generateParenthesis(2);
        System.out.println("size is: " + res.size());
        for (String str: res) {
            System.out.println(str);
        }
    }
}
