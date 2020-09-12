package com.leecode;

/**
 * 盛最多水的容器
 *
 * @author wyh
 * @version 1.0
 * @date 2020/9/12 9:43
 */
public class MaxArea {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1, maxArea = 0;
        while (i < j) {
            maxArea = height[i] < height[j] ?
                    Math.max(maxArea, (j - i) * height[i++]) :
                    Math.max(maxArea, (j - i) * height[j--]);
        }
        return maxArea;
    }
}
