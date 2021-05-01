/*
 * @lc app=leetcode.cn id=1502 lang=java
 *
 * [1502] 判断能否形成等差数列
 */

// @lc code=start
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for(int i = 2; i < arr.length; i++){
            if(arr[i] - arr[i-1] != diff){
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

