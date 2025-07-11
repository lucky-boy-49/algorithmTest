package org.example.zhongdeng;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 1353. 最多可以参加的会议数目
 */
public class S1353 {
    public int maxEvents(int[][] events) {
        //按开始时间排序
        Arrays.sort(events, Comparator.comparingInt(d -> d[0]));

        //存储当前这天可以参加的会议（的结束时间，需要贪心参加结束时间最快的会议）
        PriorityQueue<Integer> canAttend = new PriorityQueue<>();

        int res = 0;
        int curDay = events[0][0];
        int event = 0;

        while (event < events.length || !canAttend.isEmpty()) {
            //当前已经没有能参加的会议
            if (canAttend.isEmpty()) {
                curDay = events[event][0];
            }

            //将当前这天能参加的会议加入
            while (event < events.length && events[event][0] <= curDay) {
                canAttend.offer(events[event][1]);
                event++;
            }

            res++;
            canAttend.poll();
            curDay++;


            //去掉无法参加的会议
            while (!canAttend.isEmpty() && canAttend.peek() < curDay) {
                canAttend.poll();
            }
        }

        return res;
    }
}
