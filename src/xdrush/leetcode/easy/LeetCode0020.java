package xdrush.leetcode.easy;

import java.util.Stack;

/**
 * Copyright (c) 2017 XiaoMi Inc. All Rights Reserved.
 *
 * @author: wangwenjie <wangwenjie1@xiaomi.com>
 * Created on 2021/3/9
 */

public class LeetCode0020 {
    /**
     * Official solution
     * @param s
     * @return
     */
    private static boolean isValid2(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }

        while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
            if (s.contains("()")) {
                s.replace("()", "");
            } else if (s.contains("[]")) {
                s.replace("[]", "");
            } else if (s.contains("{}")) {
                s.replace("{}", "");
            }
        }

        return s.isEmpty();
    }

    private static boolean isValid(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); ++i) {
            char current = s.charAt(i);
            if (stack.empty()) {
                stack.push(s.charAt(i));
                continue;
            }
            if ((current == ')' && stack.peek() == '(')
                    || (current == ']' && stack.peek() == '[')
                    || (current == '}' && stack.peek() == '{')) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }

        return stack.empty();
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(isValid2("([)]"));
    }
}
