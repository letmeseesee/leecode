package com.leecode;

/**
 * 回文数
 *
 * @author wyh
 * @version 1.0
 * @date 2020/9/12 9:42
 */
public class IsPalindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        String palindRome = x + "";
        for (int i = 0; i < palindRome.length() / 2; i++) {
            if (palindRome.charAt(i) != palindRome.charAt(palindRome.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
