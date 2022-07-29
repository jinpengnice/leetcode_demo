package com.example.leetcode_demo.array;

/**
 * 二分查找
 * 一组有序不重复的数据
 */
public class BinarySearch {

    /**
     * 左闭右闭
     *
     * @return 查找到的元素下标，找不到返回 -1
     */
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    /**
     * 左闭右开
     *
     * @return 查找到的元素下标，找不到返回 -1
     */
    public int search2(int[] nums, int target) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target) {
                right = mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
