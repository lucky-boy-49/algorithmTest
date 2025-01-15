package org.example.zhongdeng;

/**
 * 3066. 超过阈值的最少操作数 II
 */
public class S3066_2 {
    /**
     * 优先级队列，自己写的要比内置的效率高
     *
     * <p>小顶堆
     *
     * <p>父索引为idx，左右孩子索引为：2*idx+1 2*idx+2
     *
     * <p>子索引是idx，父索引是：(idx-1)/2
     */
    public int minOperations(int[] nums1, int k) {
        long[] nums = new long[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            nums[i] = nums1[i];
        }
        // 建堆
        heapify(nums);
        int cnt = 0;
        int n = nums.length;
        int last = n - 1;
        long first = nums[0];
        while (first < k) {
            cnt++;
            swap(nums, 0, last);
            shiftDown(nums, 0, last);
            long second = nums[0];
            last--;
            swap(nums, 0, last);
            shiftDown(nums, 0, last);
            // min(x, y) * 2 + max(x, y)
            long val = first * 2 + second;
            // 入堆
            nums[last] = val;
            shiftUp(nums, last);
            first = nums[0];
        }
        return cnt;
    }

    void shiftUp(long[] nums, int i) {
        int parent = (i - 1) / 2;
        if (nums[parent] > nums[i]) {
            swap(nums, i, parent);
            // 交换当前节点和其父节点的值，把小的送上去，不会影响当前子树的小顶堆性质
            shiftUp(nums, parent);
        }
    }

    void heapify(long[] nums) {
        // 最后一个非叶子节点：2i+2 = nums.length-1
        // 向上取整：i = (nums.length-1-2+1)/2
        for (int i = (nums.length - 2) / 2; i >= 0; i--) {
            shiftDown(nums, i, nums.length);
            // int parent = (i - 1) / 2;
            // if (nums[parent] > nums[i]) {
            //   swap(nums, i, parent);
            //   // 交换当前节点和其父节点的值，就破坏了当前节点所在子树的小顶堆性质，重建当前子树的小顶堆
            // }
        }
    }

    void shiftDown(long[] nums, int i, int n) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int min = i;
        // 如下优化，就只需要一半的时间，只维护左或右子树即可
        if (left < n && nums[left] < nums[min]) {
            min = left;
            // swap(nums, left, i);
            // shiftDown(nums, left, n);
        }
        if (right < n && nums[right] < nums[min]) {
            min = right;
            // swap(nums, right, i);
            // shiftDown(nums, right, n);
        }
        if (min != i) {
            swap(nums, min, i);
            shiftDown(nums, min, n);
        }
    }

    void swap(long[] nums, int a, int b) {
        long temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
