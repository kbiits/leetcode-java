package com.nabiel.array;

import java.util.ArrayList;
import java.util.List;

public class DesignAnOrderedStream {
    String[] arr;
    int pointer;
    int n;

    public static void main(String[] args) {
        DesignAnOrderedStream sOrderedStream = new DesignAnOrderedStream(5);
        System.out.println(
                sOrderedStream.insert(3, "ccccc"));
        System.out.println(
                sOrderedStream.insert(1, "aaaaa"));
        System.out.println(
                sOrderedStream.insert(2, "bbbbb"));
        System.out.println(
                sOrderedStream.insert(5, "eeeee"));
        System.out.println(
                sOrderedStream.insert(4, "ddddd"));
    }

    public DesignAnOrderedStream(int n) {
        this.pointer = 0;
        this.arr = new String[n];
        this.n = n;
    }

    public List<String> insert(int idKey, String value) {
        List<String> res = new ArrayList<>();

        this.arr[idKey - 1] = value;
        while (this.pointer < n && this.arr[this.pointer] != null) {
            res.add(this.arr[this.pointer]);
            this.pointer++;
        }

        return res;
    }
}
