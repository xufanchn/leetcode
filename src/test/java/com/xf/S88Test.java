package com.xf;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class S88Test {

    @Test
    void merge() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        new S88().merge(nums1, m, nums2, n);
        assert Arrays.equals(nums1, new int[]{1, 2, 2, 3, 5, 6});
    }
}