package com.xf;

import org.junit.jupiter.api.Test;

class S1155Test {

    @Test
    void numRollsToTarget() {
        int target = new S1155().numRollsToTarget(2, 6, 7);
        assert target == 6;
    }
}