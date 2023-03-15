package xdrush.leetcode.others;

import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

/**
 * @author: XDRush <xudong_hust@126.com>
 * Created on 2023/3/15 14:40
 */

public class ExecutorDemo {

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(8);
        Random random = new Random();
        int cnt = 0;
        while (cnt < 100) {
            final int index = cnt;
            Future<?> future = es.submit(() -> {
                int rand = random.nextInt(10000);
                int sum = 0;
                for (int i = 0; i < rand; ++i) {
                    sum += i;
                }
                System.out.println(index + "\t" + sum);
            });
            cnt += 1;
        }

        System.exit(0);
    }
}
