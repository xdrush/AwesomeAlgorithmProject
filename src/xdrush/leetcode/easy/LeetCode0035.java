package xdrush.leetcode.easy;

/**
 * Copyright (c) 2017 XiaoMi Inc. All Rights Reserved.
 *
 * @author: wangwenjie <wangwenjie1@xiaomi.com>
 * Created on 2021/3/12
 */

public class LeetCode0035 {

    public static int binarySearch(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;
            if (nums[middle] < target)  {
                start = middle + 1;
            } else if (nums[middle] > target) {
                end = middle - 1;
            } else {
                return middle;
            }
        }

        return start;
    }

    public static int searchInsert(int[] nums, int target) {
        int index = 0;

        int start = 0;
        int end = nums.length - 1;
        index = (start + end) / 2;

        while (nums[index] > target) {
            if (nums[index] > target) {
                end--;
            }
            index = (start + end) / 2;
        }



        while (nums[index] != target) {
            if (nums[index] < target) {
                start = index;
            } else if (nums[index] > target) {
                end = index;
            } else {
                break;
            }
            index = (start + end) / 2;
        }

        return index;
    }

    public static int binarySearchV2(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int index = 0;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;
            if (nums[middle] < target)  {
                start = middle + 1;
            } else if (nums[middle] > target) {
                end = middle - 1;
            } else {
                index = middle;
                break;
            }
            System.out.println(start + "\t" + end);
        }

        return index;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] nums = new int[]{1, 3, 5, 6};
        System.out.println(binarySearch(nums, 2));
    }
}
