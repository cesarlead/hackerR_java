package com.cesarlead.hr.exercises;


//Diagonal Difference
public class Exercise07 {

    public int diagonalDifference(int[][] arr) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][arr.length - i - 1];
        }

        return Math.abs(sum1 - sum2);
    }
}
