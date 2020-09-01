package com.leecode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 有效的括号
 * @author wyh
 * @version 1.0
 * @date 2020/9/1 21:32
 */
public class IsValid {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }
    public static boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');
        char point;
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            point = s.charAt(i);
            if (map.containsKey(point)) {
                stack.push(point);
            } else {
                if (i == 0 || stack.isEmpty()) {
                    return false;
                }
                if (map.get(stack.peek()).equals(point)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
