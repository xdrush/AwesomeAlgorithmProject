package xdrush.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (c) 2017 XiaoMi Inc. All Rights Reserved.
 *
 * @author: wangwenjie <wangwenjie1@xiaomi.com>
 * Created on 2021/3/16
 */

public class LeetCode0053 {
    public static int maxSubArray(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        }

        int[] dp = new int[len];
        dp[0] = nums[0];
        for (int i = 1; i < len; i++) {
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
        }

        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            maxSum = Math.max(maxSum, dp[i]);
        }

        return maxSum;
    }

    public static int maxSubArrayV2(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        }

        int res = nums[0];
        int dp = nums[0];
        int pre = nums[0];
        for (int i = 1; i < len; i++) {
            dp = Math.max(nums[i], pre + nums[i]);
            res = Math.max(res, dp);
            pre = dp;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        // int[] input = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] input = {-1, -2};
        System.out.println(maxSubArrayV2(input));
    }
}
