package xdrush.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Copyright (c) 2017 XiaoMi Inc. All Rights Reserved.
 *
 * @author: wangwenjie <wangwenjie1@xiaomi.com>
 * Created on 2021/3/8
 */

public class LeetCode0001 {

//    class Solution {
//        public int[] twoSum(int[] nums, int target) {
//        }
//    }

    private static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = 0;
        result[1] = 0;
        Map<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            if (hash.containsKey(nums[i])) {
                result[0] = i;
                result[1] = hash.get(nums[i]);
                return result;
            }

            hash.put(target - nums[i], i);
        }


        return result;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] input = new int[]{2,7,11,15};
        int[] result = twoSum(input, 13);
        System.out.println(result[0] + "\t" + result[1]);
    }
}
