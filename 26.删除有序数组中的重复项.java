/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除有序数组中的重复项
 */

// @lc code=start
class Solution {
    // 1,1,2  --> 2
    // 0,0,1,1,1,2,2,3,3,4  --> 5  0,1,2,3,4
    // 思路：i,j两个指针，[0, i]表示无重复元素
    public int removeDuplicates(int[] nums) {
        int i = 0, j = 0;
        int n = nums.length-1;
        while(j < n) {
            if(nums[j] == nums[j+1]) {
                j++;
            }else {
                nums[++i] = nums[++j];
            }
        }
        return i+1;
    }
}
// @lc code=end

