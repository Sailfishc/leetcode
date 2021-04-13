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
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        int delt = 0;
        ListNode sumNode = new ListNode(0);
        ListNode head = sumNode.next;
        ListNode newNode = head;
        while(cur1 != null && cur2 != null){
            int sum = cur1.val + cur2.val + delt;
            int val = sum %10;
            delt = sum /10;
            newNode = new ListNode(val);
            newNode = newNode.next;
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        // 处理一个链表长一个短的情况
        if(cur1 == null) {
            // cur2还可以遍历
            while(cur2 != null){
                int sum = cur2.val + delt;
                int val = sum %10;
                delt = sum /10;
                newNode = new ListNode(val);
                newNode = newNode.next;
                cur2 = cur2.next;
            }
        }
        if(cur2 == null) {
            // cur1还可以遍历
            while(cur1 != null){
                int sum = cur1.val + delt;
                int val = sum %10;
                delt = sum /10;
                newNode = new ListNode(val);
                newNode = newNode.next;
                cur1 = cur1.next;
            }
        }
        // 处理delt的进位问题
        if (delt > 0){
            newNode = new ListNode(delt);
        }
        // 反转链表
        return reverseList(sumNode.next);
    }

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while(cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }        
        return pre;
    }
}
// @lc code=end

