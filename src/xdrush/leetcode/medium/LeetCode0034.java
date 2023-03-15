package xdrush.leetcode.medium;

/**
 * @author: XDRush <xudong_hust@126.com>
 * Created on 2023/2/20 20:30
 */

public class LeetCode0034 {
    public static int[] searchRange(int[] nums, int target) {
        int[] result =  new int[]{-1, -1};
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle] == target) {
                if (middle - 1 < 0 || nums[middle - 1] < target) {
                    System.out.println(middle);
                    break;
                }
            }
            if (nums[middle] < target) {
                left = middle + 1;
            }
            if (nums[middle] > target) {
                right = middle - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 6, 8};
        int[] result = searchRange(nums, 6);
        System.out.println(result[0] + ", " + result[1]);
    }
}
