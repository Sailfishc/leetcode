/*
 * @lc app=leetcode.cn id=34 lang=java
 *
 * [34] 在排序数组中查找元素的第一个和最后一个位置
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return new int[]{-1,-1};
        }
        int first = searchLow(nums, target);
        int last = searchHigh(nums, target);
        return new int[]{first, last};
    }


    private int searchLow(int[] nums, int target){
        int low = 0, high = nums.length-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(target == nums[mid]){
                if(mid == 0 || nums[mid] != nums[mid-1]){
                    return mid;
                }
                high = mid - 1;
            }else if(target > nums[mid]){
                low = mid + 1;
            }else{
                // target is less
                high = mid - 1;
            }
        }
        return -1;
    }

    private int searchHigh(int[] nums, int target){
        int low = 0, high = nums.length-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(target == nums[mid]){
                if(mid == nums.length-1 || nums[mid] != nums[mid+1]){
                    return mid;
                }
                low = mid + 1;
            }else if(target > nums[mid]){
                low = mid + 1;
            }else{
                // target is less
                high = mid - 1;
            }
        }
        return -1;
    }

}
// @lc code=end

