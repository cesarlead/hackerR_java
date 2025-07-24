package com.cesarlead.hr.exercises;


import java.util.Arrays;
import java.util.Collections;

// Permuting Two Arrays
public class Exercise10 {

    public String permutingTwoArrays(int k, Integer[] a, Integer[] b) {
        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());

        for (int j = 0; j < a.length; j++) {
            if (a[j] + b[j] < k) {
                return "NO";
            }
        }

        return "SI";

    }
}
