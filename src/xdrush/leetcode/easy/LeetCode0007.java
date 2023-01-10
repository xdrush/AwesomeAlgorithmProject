package xdrush.leetcode.easy;

/**
 * Copyright (c) 2017 XiaoMi Inc. All Rights Reserved.
 *
 * @author: wangwenjie <wangwenjie1@xiaomi.com>
 * Created on 2021/3/8
 */

public class LeetCode0007 {

    /**
     * Official solution
     * @param x
     * @return
     */
    private static int reverseV2(int x) {
        int result = 0;

        while (x != 0) {
            if (result * 10 / 10 != result) {
                return 0;
            }

            result = result * 10 + x % 10;
            x = x / 10;
        }

        return result;
    }

    private static int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int ones = x % 10;
            int tens = x / 10;
            if (tens == 0) {
                if ((result + x - x) != (result)) {
                    return 0;
                }
                result = result + x;
            } else {
                if (((result + ones) * 10 / 10) != (result + ones)) {
                    return 0;
                }
                result = (result + ones) * 10;
            }

            x = x / 10;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(reverse(120));
    }
}
