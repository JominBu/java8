package com.bxm.leetcode;

/**
 * 判断一个非负整数是否为两个整数的平方和。
 */
public class Day0613 {

    public static void main(String[] args) {
        int target = 9;
        int i = 0, j = target;
        while (i < j) {
            int result = i * i + j * j;
            if (result < target) {
                i++;
            } else if (result > target) {
                j--;
            } else {
                System.out.println(i + "," + j);
                return;
            }
        }
    }
}
