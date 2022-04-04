// problem: https://leetcode.com/problems/decode-xored-array/
package com.nabiel.array;

import java.util.Arrays;

public class DecodeXORedArray {
    public static void main(String[] args) {
        int[] res = decode(new int[] { 1, 2, 3 }, 1);
        System.out.println(Arrays.toString(res));
    }

    public static int[] decode(int[] encoded, int first) {
        int[] res = new int[encoded.length + 1];
        int temp = first;
        res[0] = temp;

        for (int i = 0; i < encoded.length; i++) {
            temp = encoded[i] ^ temp;
            res[i + 1] = temp;
        }

        return res;
    }
}
