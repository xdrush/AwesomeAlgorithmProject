package xdrush.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (c) 2017 XiaoMi Inc. All Rights Reserved.
 *
 * @author: wangwenjie <wangwenjie1@xiaomi.com>
 * Created on 2021/3/16
 */

public class LeetCode0509 {
    public static int fib1(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return fib1(n - 1) + fib1(n - 2);
    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");

        System.out.println(fib(14));

    }
}
