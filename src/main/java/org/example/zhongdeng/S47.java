package org.example.zhongdeng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S47 {
    // 创建一个全局变量集合，保存结果
    List<List<Integer>> alist = new ArrayList<>();
    // 讲数组的长度变为全局变量
    int len;

    public List<List<Integer>> permuteUnique(int[] nums) {
        this.len = nums.length;
        // 创建一个贯穿整个递归过程的集合
        ArrayList<Integer> all = new ArrayList<>();
        /*
        下面这个想法打错特错这样会导致最后一层的元素肯定都是被标记过的导致无元素可加
        好像也不是完全错只是我忽略了数组也是引用类型，返回上一层时，应撤销在本层的操作
        // 想到一个解决方法：参数中加上一个visited数组，将该层已经访问过的数子标记
        */
        int[] visited = new int[len];
        // 对数组进行排序
        Arrays.sort(nums);
        dfs(nums, visited, all, 0);
        return alist;
    }

    public void dfs(int[] nums, int[] visited, ArrayList<Integer> list, int index) {
        // 出口
        if (list.size() == len) {
            // 因为list是引用变量所以需要创建一个新的集合来保存list中的数据
            ArrayList<Integer> temp = new ArrayList<>(list);
            alist.add(temp);
            return;
        }
        // 将符合条件的集合加入到alist中
        for (int i = 0; i < len; i++) {
            // visit解决了自己访问自己的问题,并且
            if (visited[i] == 1) {
                continue;
            }
            // 现在解决同一层出现重复元素的问题
            // 为什么要加上这个？visited[i-1]==0
            // 解释在下面
            if (i > 0 && nums[i] == nums[i - 1] && visited[i - 1] == 0) {
                continue;
            }
            // 如果是没有访问过的就将它加入集合
            list.add(nums[i]);
            visited[i] = 1;
            dfs(nums, visited, list, index + 1);
            // 回退到上一层之前将本层加入的数据给去掉
            list.remove(list.size() - 1);
            visited[i] = 0;
        }
    }
}
