package com.bxm.leetcode;

/**
 * 在有序数组中找出两个数，使它们的和为 target。
 */
public class Day0612 {

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        if (numbers == null) {
            return;
        }
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if(sum == target) {
                System.out.println(numbers[i] + "," + numbers[j]);
                return;
            }
            if (sum < target) {
                i++;
            }
            if (sum > target) {
                j--;
            }
        }
    }
}
