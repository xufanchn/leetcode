package com.xf;

// 2678. 老人的数目
public class S2678 {
    public int countSeniors(String[] details) {
        int num = 0;
        for (String detail : details) {
            int age = Integer.parseInt(detail.substring(11, 13));
            if (age > 60) {
                num++;
            }
        }
        return num;
    }
}
