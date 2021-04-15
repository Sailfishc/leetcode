/*
 * @lc app=leetcode.cn id=328 lang=java
 *
 * [328] 奇偶链表
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
    // 要求空间复杂度是o(1)，所以不能重新啶皮新的空间
    // 第一想法：双指针
    // 1->2->3->4->5->NULL
    /**
     * 第一个指针标识奇数，第二个为偶数
     * 1 -> 3
     * 3 -> 2
     * 2 -> 4
     * 然后第一个指针向后移动
     */
    public ListNode oddEvenList(ListNode head) {
        if(head == null) {
            return head;
        }
        ListNode even = head.next;
        ListNode oddHead = head;
        ListNode evenHead = even;
        while(evenHead != null && evenHead.next != null){
            oddHead.next = oddHead.next.next;
            oddHead = oddHead.next;
            evenHead.next = evenHead.next.next;
            evenHead = evenHead.next;
        }
      oddHead.next = even;
      return head;
    }
}
// @lc code=end

