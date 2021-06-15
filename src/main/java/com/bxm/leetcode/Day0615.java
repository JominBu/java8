package com.bxm.leetcode;

/**
 * @Author BXM
 * @Date 2021/6/15
 * <p>
 * 给定一个链表，判断链表中是否有环。
 */
public class Day0615 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
    }

    /**
     * 空间复杂度O(1)
     *
     * @return
     */
    private static boolean solution1(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode node1 = head, node2 = head.next;
        while (node1 != null && node2 != null && node2.next != null) {
            if (node1 == node2) {
                return true;
            }
            node1 = node1.next;
            node2 = node2.next.next;
        }
        return false;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
