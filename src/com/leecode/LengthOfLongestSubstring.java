package com.leecode;

/**
 * 无重复字符的最长子串
 * @author wyh
 * @version 1.0
 * @date 2020/9/12 9:31
 */
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        String subStr;
        char nextPointChar;
        if(s.length() > 0){
            int headPoint = 0;
            int endPoint = 1;
            while (endPoint <= s.length()){
                subStr = s.substring(headPoint,endPoint);
                if(endPoint < s.length()) {
                    nextPointChar = s.charAt(endPoint);
                    if (subStr.indexOf(nextPointChar) > -1) {
                        headPoint = s.indexOf(nextPointChar, headPoint) + 1;
                    }
                }
                if(subStr.length() > maxLength){
                    maxLength = subStr.length();
                }
                endPoint++;
            }
        }
        return maxLength;
    }
}
