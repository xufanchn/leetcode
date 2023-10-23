package com.xf;

// 88. 合并两个有序数组
public class S88 {
    /**
     * 用nums2逐个从后往前与nums1比较，要注意游标的移动逻辑：
     * 1. nums2[i] > nums1[i] 时，nums2直接往后排，nums2游标往前移，nums1的游标不动；
     * 2. nums1[i] > nums2[i] 时，则把nums1移动到最后，再移动nums1的游标，nums2游标不动
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1;
        int index2 = n - 1;
        int index = m + n - 1;
        while (index2 >= 0) {
            if (index1 >= 0 && nums1[index1] > nums2[index2]) {
                nums1[index] = nums1[index1];
                index1--;
            } else {
                nums1[index] = nums2[index2];
                index2--;
            }
            index--;
        }
    }
}
