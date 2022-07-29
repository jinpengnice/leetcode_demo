package com.example.leetcode_demo;

import com.example.leetcode_demo.array.BinarySearch;

import org.junit.Test;

/**
 * 二分查找测试
 */
public class BinarySearchTest {

    @Test
    public void search() {
        BinarySearch search = new BinarySearch();

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 3;
        System.out.println("结果" + search.search(nums, target));
        System.out.println("结果" + search.search2(nums, target));
    }
}
