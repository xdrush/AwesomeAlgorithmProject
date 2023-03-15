package xdrush.leetcode.medium;

/**
 * @author: XDRush <xudong_hust@126.com>
 * Created on 2023/2/8 21:03
 */

public class LeetCode0011 {

    /**
     * 双循环，肯定超时
     * @param height
     * @return
     */
    public static int basicMaxArea(int[] height) {
        int len = height.length;
        if (len < 2) {
            return 0;
        }
        int area = 0;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                int tmp = (j - i) * Math.min(height[i], height[j]);
                area = Math.max(area, tmp);
            }
        }
        return area;
    }

    /**
     * 两个指针
     * @param height
     * @return
     */
    public static int maxArea(int[] height) {
        int len = height.length;
        if (len < 2) {
            return 0;
        }
        int area = 0;
        int left = 0;
        int right = len - 1;
        while (left < right) {
            int tmp = Math.min(height[left], height[right]) * (right - left);
            area = Math.max(area, tmp);
            if (height[left] < height[right]) {
                left += 1;
            } else {
                right -= 1;
            }
        }

        return area;
    }

    public static void main(String[] args) {
        int[] input = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
//        int[] input = new int[]{1, 1};
        System.out.println(maxArea(input));
    }
}
