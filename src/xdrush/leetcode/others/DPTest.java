package xdrush.leetcode.others;

/**
 * Copyright (c) 2017 XiaoMi Inc. All Rights Reserved.
 *
 * @author: wangwenjie <wangwenjie1@xiaomi.com>
 * Created on 2021/3/16
 */

public class DPTest {

    private static int bitCount(int data) {
        int count = 0;
        while (data > 0) {
            count += data & 1;
            data = data >> 1;
        }

        return count;
    }

    private static void solution(int[] arr) {
        int sum = 0;
        int len = arr.length;
        int loop = 1 << len;
        for (int i = 0; i < len; i++) {
            sum += arr[i];
        }

        int minDiff = Integer.MAX_VALUE;
        int resultIndex =  0;
        for (int i = 0; i < loop - 1; i++) {
            if (bitCount(i) != len / 2) {
                continue;
            }
            int data = i;
            int index = 0;
            int tmpSum = 0;
            while (data > 0) {
                if ((data & 1) == 1) {
                    tmpSum += arr[index];
                }
                ++index;
                data = data >> 1;
            }
            int diff = Math.abs(sum / 2 - tmpSum);
            if (diff < minDiff) {
                minDiff = diff;
                resultIndex = i;
            }
        }

        int tmpIndex = 0;
        while (resultIndex > 0) {
            if ((resultIndex & 1) == 1) {
                System.out.println(arr[tmpIndex]);
            }
            tmpIndex++;
            resultIndex = resultIndex >> 1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");

        int[] input = {102, 233, 186, 146, 275, 98, 112, 73, 255, 196};
        solution(input);
    }
}
