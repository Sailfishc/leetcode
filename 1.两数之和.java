/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {

    // nums = [2,7,11,15], target = 9
    // map 
    // key: 数组的值
    // value: 索引
    public int[] twoSum(int[] nums, int target) {
        if (nums == null){
            return new int[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int key = target - nums[i];
            if(map.containsKey(key)){
                return new int[]{map.get(key), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
// @lc code=end

