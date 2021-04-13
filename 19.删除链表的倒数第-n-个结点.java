/*
 * @lc app=leetcode.cn id=19 lang=java
 *
 * [19] 删除链表的倒数第 N 个结点
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
    // [1] 1 --> []
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head, fast = head;
        while(n > 0){
            fast = fast.next;
            n--;
        }
        if(fast == null) {
            return head.next;
        }
        while(fast != null){
            if(fast.next == null){
                slow.next = slow.next.next;
                break;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return head;
    }
}
// @lc code=end

