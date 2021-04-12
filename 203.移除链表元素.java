/*
 * @lc app=leetcode.cn id=203 lang=java
 *
 * [203] 移除链表元素
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
    
    /**
     * case：
     *      [1] 1 --> []
     *      head = [1,2,6,3,4,5,6], val = 6
     * 思路：需要特殊处理头结点，所以需要哨兵节点的帮助
     * 一个dummy节点指向头结点，一个节点进行后移的操作
     */
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(1);
        dummy.next = head;
        ListNode cur = dummy;
        while(cur.next != null) {
            ListNode next = cur.next;
            if(next.val == val) {
                cur.next = next.next;
            }else {
                cur = cur.next;
            }
        }
        return dummy.next;
    }
}
// @lc code=end

