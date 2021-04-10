/*
 * @lc app=leetcode.cn id=344 lang=java
 *
 * [344] 反转字符串
 */

// @lc code=start
class Solution {

    // ["h","e","l","l","o"]
    // ["o","l","l","e","h"]
    // 两个指针，一前一后，然后用一个临时变量做替换
    // 注意：终止条件
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while(start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}
// @lc code=end

