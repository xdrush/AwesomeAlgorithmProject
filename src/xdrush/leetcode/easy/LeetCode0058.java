package xdrush.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0058 {
    public static int lengthOfLastWord(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        int totalLen = s.length();
        int len = 0;
        for (int index = totalLen - 1; index >= 0; --index) {
            if (len > 0 && s.charAt(index) == ' ') {
                break;
            }
            if (s.charAt(index) == ' ') {
                continue;
            }

            len++;
        }

        return len;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String input = "      ";
        System.out.println(lengthOfLastWord(input));
    }
}
