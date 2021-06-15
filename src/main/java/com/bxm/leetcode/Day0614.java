package com.bxm.leetcode;

import java.util.Arrays;

/**
 * @Author BXM
 * @Date 2021/6/14
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 */
public class Day0614 {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,7,9,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 5, n = 3;
        merge2(nums1, m, nums2, n);
        Arrays.stream(nums1).forEach(System.out::println);
    }

    public static void merge1(int[] nums1, int m , int[] nums2, int n) {
        int index1 = m - 1, index2 = n - 1;
        int indexMarge = m + n - 1;
        while (index2 >= 0) {
            if (index1 < 0) {
                nums1[indexMarge--] = nums2[index2--];
            } else if (nums1[index1] > nums2[index2]) {
                nums1[indexMarge--] = nums1[index1--];
            } else {
                nums1[indexMarge--] = nums2[index2--];
            }
        }
    }

    public static void merge2(int[] nums1, int m , int[] nums2, int n) {
        int indexMarge = m + n - 1;
        m--;
        n--;
        while (n >= 0) {
            while (m >= 0 && nums1[m] > nums2[n]) {
                nums1[indexMarge--] = nums1[m--];
            }
            nums1[indexMarge--] = nums2[n--];
        }
    }


}
