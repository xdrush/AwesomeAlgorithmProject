package xdrush.leetcode.medium;

/**
 * Copyright (c) 2017 XiaoMi Inc. All Rights Reserved.
 *
 * @author: wangwenjie <wangwenjie1@xiaomi.com>
 * Created on 2021/3/12
 */

public class LeetCode0287 {

    private static int findDuplicate(int[] nums) {
        int len = nums.length;
        int sum = len * (len - 1) / 2;
        int actualSum = 0;
        for (int i = 0; i < nums.length; i++) {
            actualSum += nums[i];
        }
        System.out.println(sum);
        System.out.println(actualSum);

        return actualSum - sum;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] nums = new int[]{3, 1, 3, 4, 2};
        System.out.println(findDuplicate(nums));
    }
}
