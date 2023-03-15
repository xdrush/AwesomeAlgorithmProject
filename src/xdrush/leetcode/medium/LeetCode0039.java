package xdrush.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: XDRush <xudong_hust@126.com>
 * Created on 2023/2/10 21:25
 * @reference: https://leetcode.wang/leetCode-39-Combination-Sum.html
 */

public class LeetCode0039 {

    private static void backTrack(int[] candidates, List<List<Integer>> result, List<Integer> tmpRes, int remain, int target) {
        if (remain < 0) {
            return;
        } else if (remain == 0 && tmpRes.size() > 0) {
            result.add(tmpRes);
        } else {
            for (int i = 0; i < candidates.length; i++) {
                tmpRes.add(candidates[i]);
                backTrack(candidates, result, tmpRes, target - candidates[i], target);
                tmpRes.remove(tmpRes.size() - 1);
            }
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> tmpRes = new ArrayList<>();
        backTrack(candidates, result, tmpRes, 0, target);
        return result;
    }

    static class OOMClass{}

    public static void main(String[] args) {
        List<OOMClass> list = new ArrayList<>();
        while (true) {
            list.add(new OOMClass());
            System.gc();
        }
    }
}
