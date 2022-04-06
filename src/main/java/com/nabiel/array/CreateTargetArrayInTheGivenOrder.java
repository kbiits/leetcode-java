// problem: https://leetcode.com/problems/create-target-array-in-the-given-order/
package com.nabiel.array;

import java.util.Arrays;

public class CreateTargetArrayInTheGivenOrder {
    public static void main(String[] args) {
        int[] res = createTargetArray(new int[] { 0, 1, 2, 3, 4 }, new int[] { 0, 1, 2, 2, 1 });
        System.out.println(Arrays.toString(res));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int indexNth = index[i];
            for (int j = n - 1; j > indexNth; j--) {
                res[j] = res[j - 1];
            }
            res[indexNth] = nums[i];
        }

        return res;
    }
}
