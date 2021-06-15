package com.bxm.leetcode;

/**
 * @Author BXM
 * @Date 2021/6/15
 *
 * 删除 s 中的一些字符，使得它构成字符串列表 d 中的一个字符串，找出能构成的最长字符串。如果有多个相同长度的结果，返回字典序的最小字符串。
 */
public class Day0616 {

    public static void main(String[] args) {
        String s = "abpcplea";
        String[] d = {"ale","apple","monkey","plea"};
        String longestWord = "";
        for (String target : d) {
            if (longestWord.length() > target.length() ||
                    (longestWord.length() == target.length() && longestWord.compareTo(target) < 0)) {
                continue;
            }
            if ((isSubstr(s, target))) {
                longestWord = target;
            }
        }
        System.out.println(longestWord);
    }

    private static boolean isSubstr(String s, String target) {
        int i = 0,j = 0;
        while (i < s.length() && j < target.length()) {
            if (s.charAt(i) == target.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == target.length();
    }

}
