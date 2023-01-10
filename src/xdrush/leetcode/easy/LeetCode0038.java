package xdrush.leetcode.easy;

/**
 * Copyright (c) 2017 XiaoMi Inc. All Rights Reserved.
 *
 * @author: wangwenjie <wangwenjie1@xiaomi.com>
 * Created on 2021/3/12
 */

public class LeetCode0038 {
    public static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }

        String tempStr = countAndSay(n - 1);
        int count = 1;
        String result = "";
        for (int i = 1; i < tempStr.length(); ++i) {
            if (tempStr.charAt(i) == tempStr.charAt(i - 1)) {
                ++ count;
            } else {
                result = result + String.valueOf(count) + tempStr.charAt(i - 1);
                count = 1;
            }
        }

        result = result + String.valueOf(count) + tempStr.charAt(tempStr.length() - 1);

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(countAndSay(3));
        System.out.println(countAndSay(4));
        System.out.println(countAndSay(5));
    }
}
