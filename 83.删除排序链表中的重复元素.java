/*
 * @lc app=leetcode.cn id=83 lang=java
 *
 * [83] 删除排序链表中的重复元素
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
    // 1,1,2  
    /**
     * 特殊情况：
     *      1. 链表为空
     *      2. 链表只有一个元素
     * 思路：
     *      对比当前元素和下一个元素是否一致，如果一致，则删除后面的元素
     */
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null ){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = head;
        while(cur.next != null) {
            ListNode next = cur.next;
            if(cur.val == next.val) {
                next = next.next;
                cur.next = next;
            }else {
                cur = cur.next;
                next = next.next;
            }
        }
        return dummy.next;
    }
}
// @lc code=end

