package xdrush.leetcode.medium;

/**
 * @author: XDRush <xudong_hust@126.com>
 * Created on 2023/2/16 18:37
 */

public class LeetCode0028 {
    public static int strStr(String haystack, String needle) {
        int len1 = haystack.length();
        int len2 = needle.length();
        if (len2 > len1) {
            return -1;
        }
        for (int i = 0; i <= (len1 - len2); i++) {
            String tmp = haystack.substring(i, i + len2);
            if (needle.equals(tmp)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "abc";
        String needle = "c";
        System.out.println(strStr(haystack, needle));
    }
}
