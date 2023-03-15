package xdrush.leetcode;


import java.util.LinkedList;
import java.util.List;

public class BacktrackDemo {
    private static List<List<Integer>> result = new LinkedList<>();


    private static void solution(int[] nums) {
        LinkedList<Integer> tmp = new LinkedList<Integer>();
        boolean[] used = new boolean[nums.length];
        backtrack(nums, tmp, used);

        for (List<Integer> ele: result) {
            String str = "";
            for (Integer data : ele) {
                str += String.valueOf(data);
            }
            System.out.println(str);
        }
        System.out.println("total size is: " + String.valueOf(result.size()));
    }

    private static void backtrack(int[] nums, LinkedList<Integer> track, boolean[] used) {
        // 退出条件
        if (track.size() == nums.length) {
            result.add(new LinkedList<>(track));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }

            track.add(nums[i]);
            used[i] = true;
            backtrack(nums, track, used);
            track.removeLast();
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        long start = System.currentTimeMillis();
        solution(nums);
        System.out.println("cost: " + String.valueOf(System.currentTimeMillis() - start));
    }
}
