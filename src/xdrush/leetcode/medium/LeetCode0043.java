package xdrush.leetcode.medium;

/**
 * @author: XDRush <xudong_hust@126.com>
 * Created on 2023/2/27 20:19
 */

public class LeetCode0043 {

    public static String multiply(String num1, String num2) {

        int len1 = num1.length();
        int len2 = num2.length();
        int[] tmpRes = new int[len1 + len2];
        for (int i = len1 - 1; i >= 0; i--) {
            for (int j = len2 - 1; j >=0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                System.out.println(mul);
                int p = i + j;
                int q = i + j + 1;
                int sum = mul + tmpRes[q];
                tmpRes[p] += sum / 10;
                tmpRes[q] = sum % 10;
            }
        }
        String res = "";
        boolean valid = false;
        for (int i = 0; i < tmpRes.length; i++) {
            if (tmpRes[i] > 0 && !valid) {
                valid = true;
            }
            if (valid) {
                res = res + String.valueOf(tmpRes[i]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(multiply("589", "76"));
    }
}
