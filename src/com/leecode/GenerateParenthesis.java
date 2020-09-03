package com.leecode;

import java.util.ArrayList;
import java.util.List;

/**
 * 括号生成
 *
 * @author wyh
 * @version 1.0
 * @date 2020/9/3 21:41
 */
public class GenerateParenthesis {

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        // 特判
        if (n == 0) {
            return res;
        }

        dfs("", 0, 0, n, res);
        return res;
    }

    private void dfs(String curStr, int left, int right, int n, List<String> res) {
        if (left >= n && right >= n) {
            res.add(curStr);
        }
        if (right > left) {
            return;
        }
        if (left < n) {
            dfs(curStr + "(", left + 1, right, n, res);
        }

        if (right < n) {
            dfs(curStr + ")", left, right + 1, n, res);
        }
    }
}
