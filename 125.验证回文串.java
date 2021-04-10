/*
 * @lc app=leetcode.cn id=125 lang=java
 *
 * [125] 验证回文串
 */

// @lc code=start
class Solution {
    // A man, a plan, a canal: Panama
    // true
    // 双指针
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while(start < end) {
            while(start < end && !isDigitOrLetter(s.charAt(start))) {
                start++;
            }
            while(start < end && !isDigitOrLetter(s.charAt(end))) {
                end--;
            }
            if(s.toLowerCase().charAt(start) == s.toLowerCase().charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }

    private boolean isDigitOrLetter(char c){
        if(Character.isDigit(c) || Character.isLetter(c)){
            return true;
        }
        return false;
    }
}
// @lc code=end

