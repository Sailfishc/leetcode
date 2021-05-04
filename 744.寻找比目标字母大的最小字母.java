/*
 * @lc app=leetcode.cn id=744 lang=java
 *
 * [744] 寻找比目标字母大的最小字母
 */

// @lc code=start
class Solution {


    public char nextGreatestLetter(char[] letters, char target) {
    //     if(target >= letters[letters.length-1] || target < letters[0]){
    //         return letters[0];
    //     }
    //     int low = 0, high = letters.length - 1;
    //     while(low <= high) {
    //          int mid = low + (high - low)/2;
    //         if(letters[mid] >= target){
    //             if((mid ==0) || letters[mid-1] < target){
    //                 if(letters[mid] != letters[mid+1]){
    //                    return letters[mid] == target ? letters[mid+1] : letters[mid];
    //                 }
    //             }
    //            high = mid - 1;
    //         }else {
    //             low = mid + 1;
    //         }
    //     }
    //    return letters[0];
    }


    public char nextGreatestLetter2(char[] letters, char target) {
        if(target >= letters[letters.length-1] || target < letters[0]){
            return letters[0];
        }
        int low = 0, high = letters.length - 1;
        while(low <= high) {
             int mid = low + (high - low)/2;
            if(letters[mid] == target){
                if(letters[mid] == letters[mid+1]){
                    low = mid+1;
                }else {
                    return letters[mid+1];
                }
                
            }else if(letters[mid] < target){
                if(letters[mid+1] > target){
                    return letters[mid+1];
                } 
                low = mid + 1;
            }else {
                if(letters[mid-1] < target){
                    return letters[mid];
                }
                high = mid - 1;
            }
        }
       return letters[0];
    }
}
// @lc code=end

