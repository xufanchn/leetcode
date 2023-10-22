package com.xf;

import org.junit.jupiter.api.Test;

class S2678Test {
    @Test
    void countSeniors() {
        String[] details = {"7868190130M7522", "5303914400F9211", "9273338290F4010"};
        int num = new S2678().countSeniors(details);
        assert num == 2;
    }
}