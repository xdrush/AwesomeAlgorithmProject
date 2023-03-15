package xdrush.leetcode.medium;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LeetCode0017 {

    private static Map<String, String> letterMap = new HashMap<String, String>() {{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};
    private static List<String> result = new LinkedList<>();

    private static void backtrack(String combination, String nextDigits) {
        System.out.println(combination + ", " + nextDigits);
        if (nextDigits.isEmpty()) {
            result.add(combination);
            return;
        }

        String digit = nextDigits.substring(0, 1);
        String letters = letterMap.get(digit);
        for (int i = 0; i < letters.length(); ++i) {
            String letter = letters.substring(i, i + 1);
            backtrack(combination + letter, nextDigits.substring(1));
        }
    }

    public static List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return result;
        }
        backtrack("", digits);
        return result;
    }

    public static void main(String[] args) {
        letterCombinations("239");
        System.out.println("result size: " + result.size());
        for (String ele: result) {
            System.out.println(ele);
        }
    }
}
