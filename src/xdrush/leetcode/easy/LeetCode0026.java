package xdrush.leetcode.easy;

/**
 * Copyright (c) 2017 XiaoMi Inc. All Rights Reserved.
 *
 * @author: wangwenjie <wangwenjie1@xiaomi.com>
 * Created on 2021/3/11
 */

public class LeetCode0026 {

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int result = 0;

        int cur = nums[0];
        result = 1;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] > cur) {
                cur = nums[i];
                nums[result] = cur;
                result += 1;
            }
        }

//        for (int i = 0; i < result; ++i) {
//            System.out.println(nums[i]);
//        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
}
