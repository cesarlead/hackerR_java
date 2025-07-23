package com.cesarlead.hr.exercises;

/*
 * miniMaxSum
 * */
public class Exercise02 {


    public String miniMaxSum(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
            sum += arr[i];
        }

        return String.format("%d %d", sum - max, sum - min);
    }

    public static void main(String[] args) {
        System.out.println(new Exercise02().miniMaxSum(new int[]{1, 2, 33, 3, 4, 5, 45, 20, 80}));
    }
}
