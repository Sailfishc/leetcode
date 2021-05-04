/*
 * @lc app=leetcode.cn id=33 lang=java
 *
 * [33] 搜索旋转排序数组
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(target == nums[mid]){
                return mid;
            }
            if(nums[low] <= nums[mid]){
                if(target >= nums[low] && target < nums[mid]){
                    high = mid - 1;
                }else {
                    low = mid + 1;
                }
            }else{
                if(target > nums[mid] && target <= nums[high]){
                   low = mid + 1;
                }else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
// @lc code=end

