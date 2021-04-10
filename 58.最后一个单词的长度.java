/*
 * @lc app=leetcode.cn id=58 lang=java
 *
 * [58] 最后一个单词的长度
 */

// @lc code=start
class Solution {

    // 考点应该是数组
    // "Hello World" 
    /**
     * case:
     *      "Hello World"
     *      ""
     *      " "
     *      " Hello World  "
     *      "a "
     */
    public int lengthOfLastWord(String s) {
        int left = 0;
        int right = 0;
        int len = 0;
        while(right < s.length()){
            while(right < s.length() && s.charAt(right) == ' '){
                left++;
                right++;
            }
            if(right == s.length()){
                break;
            }
            while(right < s.length() && s.charAt(right) != ' '){
                right++;
            }
            len = right - left;
            left = right;
        }
        return len;
    }


    public int lengthOfLastWord2(String s) {
        if(s == null || "".equals(s.trim())){
            return 0;
        }
        String[] str = s.split(" ");
        return str[str.length-1].trim().length();
    }
}
// @lc code=end

