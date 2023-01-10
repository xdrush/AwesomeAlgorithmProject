package xdrush.leetcode.easy;

/**
 * Copyright (c) 2017 XiaoMi Inc. All Rights Reserved.
 *
 * @author: wangwenjie <wangwenjie1@xiaomi.com>
 * Created on 2021/3/8
 */

public class LeetCode0009 {
    private static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int result = 0;
        int data = x;
        while (data != 0) {
            result = result * 10 + data % 10;
            data = data / 10;
        }

        return result == x;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(isPalindrome(120));
        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
    }
}
