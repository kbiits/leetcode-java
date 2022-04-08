// resource: https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/

package com.nabiel.array;

import java.util.Arrays;

public class MinimumNumberOfMovesToSeatEveryone {
    public static void main(String[] args) {
        int[] seats = { 3, 1, 5 };
        int[] students = { 2, 7, 4 };
        System.out.println(minMovesToSeat(seats, students));
    }

    public static int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);

        int min = 0;
        for (int i = 0; i < seats.length; i++) {
            min += Math.abs(seats[i] - students[i]);
        }

        return min;
    }
}
