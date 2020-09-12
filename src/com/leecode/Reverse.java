package com.leecode;

/**
 * 整数反转
 * @author wyh
 * @version 1.0
 * @date 2020/9/12 9:40
 */
public class Reverse {
    public int reverse(int x) {
        int res = 0;
        while(x!=0) {
            int tmp = x%10;
            if (res>214748364 || (res==214748364 && tmp>7)) {
                return 0;
            }
            if (res<-214748364 || (res==-214748364 && tmp<-8)) {
                return 0;
            }
            res = res*10 + tmp;
            x /= 10;
        }
        return res;
    }
}
