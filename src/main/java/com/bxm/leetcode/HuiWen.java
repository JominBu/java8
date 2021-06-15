package com.bxm.leetcode;

/**
 * 可以删除一个字符，判断是否能构成回文字符串。
 */
public class HuiWen {

    public static void main(String[] args) {
//        solution1(121);
        System.out.println(solution2("abcba"));
    }

    private static void solution1(int i) {
        String s = new StringBuilder(i + "").reverse().toString();
        System.out.println((i + "").equals(s));
        ;
    }

    private static boolean solution2(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return isPalindrome(s, i, j - 1) || isPalindrome(s, i + 1, j);
            }
        }
        return true;
    }

    private static boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }


}
