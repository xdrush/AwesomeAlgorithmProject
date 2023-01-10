package xdrush.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Copyright (c) 2017 XiaoMi Inc. All Rights Reserved.
 *
 * @author: wangwenjie <wangwenjie1@xiaomi.com>
 * Created on 2021/3/8
 */

public class LeetCode0013 {
    public static int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); ++i) {
            switch (s.charAt(i)) {
                case 'I':
                    result += 1;
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'X':
                    result += 10;
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'C':
                    result += 100;
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;
                    default:
                        break;
            }

            if (i > 0) {
                if (s.charAt(i - 1) == 'I' && (s.charAt(i) == 'V' || s.charAt(i) == 'X')) {
                    result -= 1 * 2;
                }
                if (s.charAt(i - 1) == 'X' && (s.charAt(i) == 'C' || s.charAt(i) == 'L')) {
                    result -=  10 * 2;
                }
                if (s.charAt(i - 1) == 'C' && (s.charAt(i) == 'D' || s.charAt(i) == 'M')) {
                    result -= 100 * 2;
                }
            }

        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(romanToInt("MMMXLV"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }
}
