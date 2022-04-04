// problem: https://leetcode.com/problems/decompress-run-length-encoded-list/
package com.nabiel.array;

import java.util.Arrays;

public class DecompressRunLengthEncodedList {
    public static void main(String[] args) {
        int[] res = decompressRLElist(new int[] { 1, 1, 2, 3 });
        System.out.println(Arrays.toString(res));
    }

    public static int[] decompressRLElist(int[] nums) {
        int size = 0;
        for (int i = 0; i < nums.length; i += 2) {
            size += nums[i];
        }

        int[] res = new int[size];
        int pointer = 0;
        for (int i = 0; i < nums.length; i += 2) {
            int freq = nums[i];
            int val = nums[i + 1];

            for (int j = 0; j < freq; j++) {
                res[pointer] = val;
                pointer++;
            }
        }
        return res;
    }

    public static int[] decompressRLElistOptimized(int[] nums) {
        int size = 0;
        for (int i = 0; i < nums.length; i += 2) {
            size += nums[i];
        }
        int[] res = new int[size];
        int pointer = 0;
        for (int i = 0; i < nums.length; i += 2) {
            int freq = nums[i];
            Arrays.fill(res, pointer, pointer + freq, nums[i + 1]);
            pointer += freq;
        }

        return res;
    }
}
