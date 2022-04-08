// resource: https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/

package com.nabiel.array;

public class CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {
        String[] word1 = { "abc", "d", "defg" };
        String[] word2 = { "abcddefg" };

        System.out.println(arrayStringsAreEqual2(word1, word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int pointer1Inner, pointer2Inner, pointer1Outer, pointer2Outer;
        pointer1Inner = pointer1Outer = pointer2Inner = pointer2Outer = 0;

        while (pointer1Outer < word1.length && pointer2Outer < word2.length) {
            String curr1 = word1[pointer1Outer];
            String curr2 = word2[pointer2Outer];
            int n1 = curr1.length();
            int n2 = curr2.length();
            while (pointer1Inner < n1 && pointer2Inner < n2) {
                if (curr1.charAt(pointer1Inner) != curr2.charAt(pointer2Inner)) {
                    return false;
                }

                pointer1Inner++;
                pointer2Inner++;
            }

            if (pointer1Inner >= n1) {
                pointer1Outer++;
                pointer1Inner = 0;
            }
            if (pointer2Inner >= n2) {
                pointer2Outer++;
                pointer2Inner = 0;
            }
        }

        return pointer1Outer == word1.length && pointer2Outer == word2.length;
    }

    public static boolean arrayStringsAreEqual3(String[] word1, String[] word2) {
        int pointer1Inner, pointer2Inner, pointer1Outer, pointer2Outer;
        pointer1Inner = pointer1Outer = pointer2Inner = pointer2Outer = 0;

        while (pointer1Outer < word1.length && pointer2Outer < word2.length) {
            String curr1 = word1[pointer1Outer];
            String curr2 = word2[pointer2Outer];
            int n1 = curr1.length();
            int n2 = curr2.length();
            if (curr1.charAt(pointer1Inner) != curr2.charAt(pointer2Inner)) {
                return false;
            }

            if (pointer1Inner < n1 - 1) {
                pointer1Inner++;
            } else {
                pointer1Outer++;
                pointer1Inner = 0;
            }
            if (pointer2Inner < n2 - 1) {
                pointer2Inner++;
            } else {
                pointer2Outer++;
                pointer2Inner = 0;
            }
        }

        return pointer1Outer == word1.length && pointer2Outer == word2.length;
    }

    public static boolean arrayStringsAreEqual2(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for (String word : word1) {
            s1.append(word);
        }
        for (String word : word2) {
            s2.append(word);
        }
        return s1.toString().equals(s2.toString());
    }
}
