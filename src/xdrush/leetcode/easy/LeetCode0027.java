package xdrush.leetcode.easy;

/**
 * Copyright (c) 2017 XiaoMi Inc. All Rights Reserved.
 *
 * @author: wangwenjie <wangwenjie1@xiaomi.com>
 * Created on 2021/3/11
 */

public class LeetCode0027 {

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != val) {
                int temp = nums[i];
                nums[i] = nums[count];
                nums[count] = temp;
                ++ count;
            }
        }

//        for (int i = 0; i < count; ++i) {
//            System.out.println(nums[i]);
//        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums, 2));
    }
}
