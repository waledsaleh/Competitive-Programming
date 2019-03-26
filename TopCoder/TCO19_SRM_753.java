package com.think;

public class TCO19_SRM_753 {


    public int howLong(String text) {
        int sum = 0, diff;

        for (char ch : text.toCharArray()) {
            diff = (ch - 'a' + 1);
            sum += diff + (diff - 1);
        }

        return sum;

    }
}
