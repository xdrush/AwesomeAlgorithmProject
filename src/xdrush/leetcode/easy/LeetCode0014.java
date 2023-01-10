package xdrush.leetcode.easy;

/**
 * Copyright (c) 2017 XiaoMi Inc. All Rights Reserved.
 *
 * @author: wangwenjie <wangwenjie1@xiaomi.com>
 * Created on 2021/3/9
 */

public class LeetCode0014 {
    public static String longestCommonPrefix(String[] strs) {
        String result = "";
        if (strs == null || strs.length == 0) {
            return result;
        }
        if (strs.length < 2) {
            return strs[0];
        }
        boolean end = false;
        int start = -1;
        for (int i = 0; i < strs[0].length(); ++i) {
            for (int j = 1; j < strs.length; ++j) {
                System.out.println(i + "\t" + j);
                if ((strs[j].length() <= i || (strs[j].charAt(i) != strs[0].charAt(i)))) {
                    end = true;
                    break;
                }
            }
            if (end) {
                break;
            }
            ++start;
        }

        if (start >= 0) {
            result = strs[0].substring(0, start + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String[] strs = new String[]{"ab", "a"};
        System.out.println(longestCommonPrefix(strs));
    }
}
