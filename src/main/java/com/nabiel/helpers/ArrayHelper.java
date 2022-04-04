package com.nabiel.helpers;

public class ArrayHelper {

    public static <T> boolean isArraySame(T[] arr1, T[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        int n = arr1.length;
        for (int i = 0; i < n; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }
}
