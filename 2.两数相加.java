/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    // 倒序排列，可以遍历两个链表直接相加
    // 设置进位要存储的值：两数之和 /10
    // 当前值：两数之和%10
    // 循环条件：两个链表都不为空
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tail = null;
        int carry = 0;
        while(l1 != null || l2 != null) {
            int n1 = l1 == null ? 0 : l1.val;
            int n2 = l2 == null ? 0 : l2.val;
            int sum = n1+n2+ carry;
            carry = sum / 10;
            // 第一个元素
            if(head == null){
                head = tail = new ListNode(sum%10);
            }else {
                tail.next = new ListNode(sum%10);
                tail = tail.next;
            }
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }
        if(carry > 0){
            tail = new ListNode(carry);
        }
        return head;
    }

}
// @lc code=end

