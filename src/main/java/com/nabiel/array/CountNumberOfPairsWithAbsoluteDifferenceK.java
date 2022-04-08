// resource: https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/

package com.nabiel.array;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfPairsWithAbsoluteDifferenceK {
    public static void main(String[] args) {
        int k = 1;
        int[] nums = { 1, 2, 2, 1 };
        System.out.println(countKDifference(nums, k));
    }

    public static int countKDifference(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int curr = nums[i];
            if (map.containsKey(curr + k)) {
                sum += map.get(curr + k);
            }
            if (map.containsKey(curr - k)) {
                sum += map.get(curr - k);
            }

            map.put(curr, map.getOrDefault(curr, 0) + 1);
        }

        return sum;
    }
}
