// problem: https://leetcode.com/problems/shuffle-the-array/
package com.nabiel.array;

import java.util.Arrays;

public class ShuffleTheArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solveNaiveApproach(new int[] { 2, 5, 1, 3, 4, 7 }, 3)));
    }

    public static int[] solveNaiveApproach(int[] nums, int n) {
        // temp used to store the result array
        int[] temp = new int[2 * n];
        for (int i = 0; i < n; i++) {
            temp[2 * i] = nums[i];
            temp[2 * i + 1] = nums[i + n];
        }

        return temp;
    }
}
