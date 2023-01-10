package xdrush.leetcode.others;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Copyright (c) 2017 XiaoMi Inc. All Rights Reserved.
 *
 * @author: wangwenjie <wangwenjie1@xiaomi.com>
 * Created on 2021/3/16
 */

public class DivideTest {
    private static boolean equal(int i, int j) {
        String tmp = String.valueOf(i) + String.valueOf(j);
        for (int ind = 1; ind < 10; ind++) {
            if (!tmp.contains(String.valueOf(ind))) {
                return false;
            }
        }
        return true;
    }

    private static boolean isUniqNumber(int i, int len) {
        Set<String> tmpChar = new HashSet<>();
        int tmpValue = i;
        while (tmpValue > 0) {
            int data = tmpValue % 10;
            tmpChar.add(String.valueOf(data));
            tmpValue = tmpValue / 10;
        }

        return tmpChar.size() == len;
    }

    private static List<String> solution(int target) {
        List<String> result = new ArrayList<>();

        for (int i = 1234; i < 9876; i++) {
            int tmp = i * target;
            if (isUniqNumber(i, 4) && isUniqNumber(tmp, 5) && equal(i, tmp)) {
                String ret = String.valueOf(i) + "/" + String.valueOf(tmp) + "=1/" + String.valueOf(target);
                result.add(ret);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");

        List<String> result = solution(7);
        System.out.println(result.size());
        for (String item : result) {
            System.out.println(item);
        }
    }
}
