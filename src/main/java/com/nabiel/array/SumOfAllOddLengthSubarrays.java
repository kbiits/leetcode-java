package com.nabiel.array;

public class SumOfAllOddLengthSubarrays {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 5, 3 };
        System.out.println(sumOddLengthSubarrays(arr));
    }

    // naive solution
    public static int naiveSumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < arr.length; i += 2) {
            int len = i;
            int start = 0;
            while ((start + len) < n) {
                int newLen = start + len;
                for (int j = start; j <= newLen; j++) {
                    sum += arr[j];
                }
                start++;
            }
        }

        return sum;
    }

    // optimized solution
    public static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int kTimesAdded = (i + 1) * (n - i);
            // (x + 1) / 2, because we just want to add odd length subarray
            sum += (kTimesAdded + 1) / 2 * arr[i];
        }

        return sum;
    }
}
