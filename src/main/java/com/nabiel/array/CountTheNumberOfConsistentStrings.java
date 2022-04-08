// resource: https://leetcode.com/problems/count-the-number-of-consistent-strings/

package com.nabiel.array;

import java.util.HashSet;
import java.util.Set;

public class CountTheNumberOfConsistentStrings {
    public static void main(String[] args) {
        String allowed = "abc";
        String[] words = { "a", "b", "c", "ab", "ac", "bc", "abc" };
        System.out.println(countConsistentStrings(allowed, words));
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        Set<Character> map = new HashSet<>();
        for (char i : allowed.toCharArray()) {
            map.add(i);
        }

        int result = words.length;
        for (String word : words) {
            for (char a : word.toCharArray()) {
                if (!map.contains(a)) {
                    result--;
                    break;
                }
            }
        }

        return result;
    }

    public static int countConsistentStrings2(String allowed, String[] words) {
        Set<Character> map = new HashSet<>();
        for (char i : allowed.toCharArray()) {
            map.add(i);
        }

        int result = 0;
        for (int i = 0; i < words.length; i++) {
            boolean isConsistent = true;
            for (char a : words[i].toCharArray()) {
                if (!map.contains(a)) {
                    isConsistent = false;
                    break;
                }
            }
            if (isConsistent) {
                result++;
            }
        }

        return result;
    }
}
