/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */

// @lc code=start
class Solution {

    // 不转换为字符串
    // 注意事项：反转之后可能会溢出
    // 解法：反转一半
    // 121  -> 1和1作比较
    // 1221 -> 12 12作比较
    // 小于0肯定是false，可以被10整除的肯定是false
    public boolean isPalindrome(int x) {
        if(x <0 || (x > 0 && x % 10 == 0)) {
            return false;
        }
        int reverse = 0;
        while (x > reverse) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }

        return x == reverse || x == reverse /10;
    }

    public boolean isPalindrome2(int x) {
        String s = String.valueOf(x);
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)){
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

