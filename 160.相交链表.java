/*
 * @lc app=leetcode.cn id=160 lang=java
 *
 * [160] 相交链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    // 这个思路真的是很难想到，最常见的是Hash表的思路

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        while(headA != null){
            set.add(headA);
            headA = headA.next;
        }
        while(headB != null){
            if(set.contains(headB)){
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }


    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        ListNode h1 = headA;
        ListNode h2 = headB;
        while(h1 != h2) {
            if(h1 != null){
                h1 = h1.next;
            }else {
                h1 = headB;
            }
            if(h2 != null){
                h2 = h2.next;
            }else{
                h2 = headA;
            }
        }
        return h1;
    }
}
// @lc code=end

