// resource: https://leetcode.com/problems/truncate-sentence/

package com.nabiel.array;

import java.util.Arrays;

public class TruncateSentence {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        System.out.println(truncateSentence(s, k));
    }

    public static String truncateSentence(String s, int k) {
        StringBuilder res = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                k--;
            }
            if (k == 0) {
                break;
            }
            res.append(c);
        }

        return res.toString();
    }

    public static String truncateSentenceOneLiner(String s, int k) {
        return String.join(" ", Arrays.copyOf(s.split(" "), k));
    }

    public static String truncateSentenceNaive(String s, int k) {
        int pointer = 0;
        int prevIdx = 0;
        int counterWords = 0;
        String res = "";
        int n = s.length();

        for (char c : s.toCharArray()) {
            if (c == ' ' || pointer == n - 1) {
                System.out.println(prevIdx + "," + (pointer + 1));
                res += s.substring(prevIdx, pointer + 1);
                prevIdx = pointer + 1;
                counterWords++;
                if (counterWords == k) {
                    if (pointer != n - 1) {
                        res = res.substring(0, res.length() - 1);
                    }
                    break;
                }
            }
            pointer++;
        }

        return res;
    }
}
