/*
 * @lc app=leetcode.cn id=153 lang=java
 *
 * [153] 寻找旋转排序数组中的最小值
 */

// @lc code=start
class Solution {

    // 如何确定一个最小的元素：上一个元素比当前元素大，下一个元素也比当前元素大，则当前元素就是最小的
    // 或者说上一个元素比自己大，则当前元素就是最小的
    // 3,4,5,1,2
    // 特殊情况
    // 1,2,3,4,5
    // 3,4,5,1
    // 1
    // 1,2
    public int findMin(int[] nums) {
        int low = 0, high = nums.length-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            
            if(low == high){
                return nums[low];
            }
            if((mid != 0 && nums[mid] < nums[mid-1])
                || (mid == 0 && nums[mid] < nums[high])){
                return nums[mid];
            }else if(nums[mid] > nums[high]){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
// @lc code=end

