package com.leecode;

/**
 * 字符串转换整数 (atoi)
 *
 * @author wyh
 * @version 1.0
 * @date 2020/9/12 9:41
 */
public class MyAtoi {
    public int myAtoi(String str) {
        int index = 0, sign = 1, ans = 0, digit = 0;
        if (str == null || str.length() == 0) {
            return 0;
        }
        int len = str.length();
        while (index < len && str.charAt(index) == ' ') {
            index++;
        }
        if (index == len) {
            return 0;
        }
        if (str.charAt(index) == '+' || str.charAt(index) == '-') {
            sign = str.charAt(index) == '+' ? 1 : -1;
            index++;
        }
        while (index < len) {
            digit = str.charAt(index) - '0';
            if (digit < 0 || digit > 9) {
                break;
            }
            if (ans > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            ans = 10 * ans + digit;
            index++;
        }
        return ans * sign;
    }
}
