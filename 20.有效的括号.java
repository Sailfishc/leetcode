/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    
    // 字符串为奇数则一定为false
    // 定义map，存储映射
    // 如果是'('（value），可以直接存储

    public boolean isValid(String s) {
        if(s.length() % 2 == 1){
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character> stack = new Stack<>();
        int i = 0;
        while(i < s.length()){
            char c = s.charAt(i++);
            if(map.containsKey(c)){
                if(stack.isEmpty() || !stack.peek().equals(map.get(c))){
                    return false;
                }
                stack.pop();
            }else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
// @lc code=end

