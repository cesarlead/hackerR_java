package com.cesarlead.hr.exercises;

/*
 * Plus Minus
 */
public class Exercise01 {

    public String plusMinus(int[] arr) {

        int positive = 0;
        int negative = 0;
        int zero = 0;
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            if (arr[i] > 0) {
                positive++;
            } else if (arr[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        if (len == 0) {
            return "0.000000\n0.000000\n0.000000";
        }

        return String.format("%.6f%n" + "%.6f%n" + "%.6f", (double) positive / arr.length,
                (double) negative / arr.length, (double) zero / arr.length);

    }

    public static void main(String[] args) {
        System.out.println(new Exercise01().plusMinus(new int[]{-4, 3, -9, 0, 4, 1}));
    }

}
