package com.cesarlead.hr.exercises;

// Counting Sort 1
public class Exercise08 {

    public int[] countingSort(int[] arr) {
        var result = new int[4];

        for (int j : arr) {
            result[j]++;
        }
        return result;
    }
}
