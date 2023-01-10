package xdrush.leetcode.others;


public class InterviewDF {

    /**
     * 算法说明：采用动态规划思路
     * @param input
     * @return
     */
    public static int solution(int[] input) {
        int len = input.length;
        // 如果数组大小为1，则直接返回1
        if (len == 1) {
            return 1;
        }

        // dp[i]表示nums[i]结尾的最大严格递增子序列长度
        int[] dp = new int[len];

        // 初始化状态
        for (int i = 0; i < len; i++) {
            dp[i] = 1;
        }

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < i; j++) {
                // 严格递增
                if (input[i] > input[j]) {
                    // 状态转移方程为: dp[i] = max(dp[i], dp[j] + 1)，递增则加1
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        // 遍历dp数组，返回其中最大的元素
        int result = 0;
        for (int i = 0; i < len; i++) {
            result = Math.max(result, dp[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int input[] = {0, 3, 1, 6, 2, 2, 7};
        System.out.println(solution(input));
    }
}
