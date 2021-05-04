/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target > nums[nums.length-1]){
            return nums.length;
        }
        if(target < nums[0]){
            return 0;
        }
        int low = 0, high = nums.length;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                if(nums[mid-1] < target){
                    return mid;
                }
                high = mid - 1;
            }else{
                if(nums[mid+1] > target){
                    return mid+1;
                }
                low = mid + 1;
            }
        }
        return -1;
    }
}
// @lc code=end

